@echo off
cls
:: Batch script to push to a branch and merge with master
:: Get source branch name from user input
:get_source_branch
set /p source_branch="Enter your branch name (or press Enter to see a list): "
if "%source_branch%" == "" goto list_branches
:: Check if source branch exists
git show-ref --verify --quiet "refs/heads/%source_branch%"
if %ERRORLEVEL% NEQ 0 (
echo Branch '%source_branch%' does not exist.
goto get_source_branch
)
:: Switch to existing branch
echo Switching to existing branch '%source_branch%'...
git checkout %source_branch%
goto add_commit
:list_branches
echo Available branches:
git branch
echo.
set /p source_branch="Enter the branch name to use: "
if "%source_branch%" == "" goto end
goto get_source_branch
:add_commit
:: Add all changes
echo Adding all changes...
git add .
:: Commit changes
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
echo 2. Other branch
set /p merge_option="Enter your choice (1 or 2): "
if "%merge_option%" == "1" (
set merge_branch=master
) else if "%merge_option%" == "2" (
set /p merge_branch="Enter the branch name: "
) else (
echo Invalid choice. Please try again.
goto select_merge_branch
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