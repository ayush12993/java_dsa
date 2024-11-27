@echo off
cls
setlocal enabledelayedexpansion

:: Enhanced Git Push and Merge Script

:: Function to list changes
:list_changes
echo Changes in the repository:
git status -s
echo.
goto :select_files

:: Function to select files to stage
:select_files
set "selected_files="
set /p select_mode="Choose file selection mode (A)ll, (M)anual, or (P)artial: "
if /i "%select_mode%"=="A" (
    git add .
    goto :confirm_changes
) else if /i "%select_mode%"=="M" (
    set /p specific_files="Enter specific files to stage (space-separated): "
    for %%f in (%specific_files%) do (
        git add "%%f"
    )
    goto :confirm_changes
) else if /i "%select_mode%"=="P" (
    :partial_selection
    echo Available changes:
    git status -s
    echo.
    set /p file_to_stage="Enter file to stage (or 'done' to finish): "
    if /i "!file_to_stage!"=="done" goto :confirm_changes
    git add "!file_to_stage!"
    goto :partial_selection
) else (
    echo Invalid selection. Please try again.
    goto :select_files
)

:: Confirm staged changes
:confirm_changes
echo Staged changes:
git diff --staged
set /p confirm="Confirm staged changes? (Y/N): "
if /i "%confirm%"=="N" goto :list_changes

:: Get source branch name
:get_source_branch
set /p source_branch="Enter your branch name (or press Enter to see a list): "
if "%source_branch%"=="" goto :list_branches
:: Check if source branch exists
git show-ref --verify --quiet "refs/heads/%source_branch%"
if %ERRORLEVEL% NEQ 0 (
    echo Branch '%source_branch%' does not exist.
    goto :get_source_branch
)

:: Switch to existing branch
echo Switching to existing branch '%source_branch%'...
git checkout %source_branch%

:: Commit changes
:add_commit
set /p commit_message="Enter commit message: "
git commit -m "%commit_message%"

:: Push to source branch
echo Pushing to %source_branch%...
git push origin %source_branch%

:: Select the branch to merge with
:select_merge_branch
echo.
echo Select the branch to merge into:
echo 1. Master
echo 2. Main
echo 3. Other branch
set /p merge_option="Enter your choice (1, 2, or 3): "
if "%merge_option%"=="1" (
    set merge_branch=master
) else if "%merge_option%"=="2" (
    set merge_branch=main
) else if "%merge_option%"=="3" (
    set /p merge_branch="Enter the branch name: "
) else (
    echo Invalid choice. Please try again.
    goto :select_merge_branch
)

:: Switch to the merge branch
echo Switching to %merge_branch%...
git checkout %merge_branch%

:: Pull latest changes from merge branch
echo Pulling latest changes from %merge_branch%...
git pull origin %merge_branch%

:: Merge source branch into merge branch
echo Merging %source_branch% into %merge_branch%...
git merge %source_branch%

:: Handle merge conflicts if any
if %ERRORLEVEL% NEQ 0 (
    echo Merge conflicts detected!
    set /p resolve_conflicts="Do you want to resolve conflicts now? (Y/N): "
    if /i "!resolve_conflicts!"=="Y" (
        start git mergetool
        set /p conflicts_resolved="Have you resolved all conflicts? (Y/N): "
        if /i "!conflicts_resolved!"=="Y" (
            git add .
            git commit -m "Merge conflicts resolved"
        ) else (
            echo Please resolve conflicts manually before continuing.
            goto :end
        )
    ) else (
        echo Please resolve conflicts manually before merging.
        goto :end
    )
)

:: Push merged changes to merge branch
echo Pushing merged changes to %merge_branch%...
git push origin %merge_branch%

:: Switch back to source branch
echo Switching back to %source_branch%...
git checkout %source_branch%

echo.
echo Process completed successfully!
echo Current branch: %source_branch%

:end
pause