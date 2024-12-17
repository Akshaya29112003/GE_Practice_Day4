Git Flow :
Here is the expected workflow to implement Git Flow as per your requirements:

Initialize the Repository:
>git init
>git remote add origin <repo-url>

Create Master Branch:
Create and push the Welcome Message:
>git checkout -b main
>git add Main.java
>git commit -m "Add: Welcome to Line Comparison Computation Program"
>git push -u origin main

For Each Use Case:
Create a Branch:
>git checkout -b CartesianSystemUC1

Add and Commit Code:
>cd Line_Computation_Problem
>git add UC1.java
>git commit -m "Add: UC-1 Cartesian System Check Implementation"

Push to Remote Branch:
>git push -u origin CartesianSystemUC1

Merge with Local Master:
>cd ..
>git checkout main
>git merge EmployeeAttendanceUC
>git push origin main

Repeat Steps for UC-2 and UC-3:

Change the branch name and follow the same flow.

