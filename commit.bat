@echo off
REM Commit and push all changes in the repo

SET /P COMMIT_MSG="Enter commit message: "

REM Navigate to your repo root (adjust path if needed)
cd /d "C:\Users\Kris\runanywhere-sdks\Playground\android-use-agent"

REM Stage all changes
git add -A

REM Commit with user-provided message
git commit -m "%COMMIT_MSG%"

REM Push to main branch
git push origin main

pause