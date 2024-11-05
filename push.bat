@echo off
:: Batch script to push to a branch and merge

:: Get branch names from user input
set /p source_branch="Enter the source branch name: "
set /p target_branch="Enter the target branch name to merge into: "

:: Add all changes
git add .

:: Commit changes
set /p commit_message="Enter commit message: "
git commit -m "%commit_message%"

:: Push to source branch
echo Pushing to %source_branch%...
git push origin %source_branch%

:: Switch to target branch
echo Switching to %target_branch%...
git checkout %target_branch%

:: Pull latest changes from target branch
echo Pulling latest changes from %target_branch%...
git pull origin %target_branch%

:: Merge source branch into target branch
echo Merging %source_branch% into %target_branch%...
git merge %source_branch%

:: Push merged changes
echo Pushing merged changes to %target_branch%...
git push origin %target_branch%

:: Switch back to source branch
git checkout %source_branch%

echo.
echo Process completed successfully!
echo Current branch: %source_branch%
pause