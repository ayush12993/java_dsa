@echo off
:: Batch script to push to a branch and merge with master

:: Get source branch name from user input
set /p source_branch="Enter your branch name: "

:: Check if source branch exists
git show-ref --verify --quiet "refs/heads/%source_branch%"
if %ERRORLEVEL% NEQ 0 (
    :: Branch doesn't exist, create it
    echo Creating new branch '%source_branch%'...
    git checkout -b %source_branch%
) else (
    :: Switch to existing branch
    echo Switching to existing branch '%source_branch%'...
    git checkout %source_branch%
)

:: Add all changes
echo Adding all changes...
git add .

:: Commit changes
set /p commit_message="Enter commit message: "
git commit -m "%commit_message%"

:: Push to source branch
echo Pushing to %source_branch%...
git push origin %source_branch%

:: Switch to master branch
echo Switching to master...
git checkout master

:: Pull latest changes from master
echo Pulling latest changes from master...
git pull origin master

:: Merge source branch into master
echo Merging %source_branch% into master...
git merge %source_branch%

:: Push merged changes to master
echo Pushing merged changes to master...
git push origin master

:: Switch back to source branch
echo Switching back to %source_branch%...
git checkout %source_branch%

echo.
echo Process completed successfully!
echo Current branch: %source_branch%
pause