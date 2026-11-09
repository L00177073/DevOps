# DevOps

**BRANCHING STRATEGY**

The project follows a simplidfied GitFlow-inspired feature-branch workflow to organise development, testing, documentation, and releases. The main branch serves as the primary integration branch, containing completed changes merged through pull requests. The release branch is maintained for stable versions of the project.Development is performed on short-lived branches created from main some examples are:

        feature/* – Implements new functionality, such as feature/multiplication.

        test/* – Adds and improves unit tests, such as test/multiplication-tests.

        docs/* – Updates project documentation.

Every task is tracked using Github issues and proper commit-style messages are used for any changes in the project. When development is completed the short-lived branch is pushed to GitHub and a pull request is created against main. The pull request is linked to the issue, in that way any changes that will be commited can be reviewed before the final merge. After the merge is completed the short-lived branch is deleted to keep the repository more organized. Git retains the merge and pull history for reviewing. Eventually the stable changes of the main branch are realesed to the release branch. The most stark difference between my branching strategy and traditional GitFlow is that my strategy does not use a permanent develop branch. Instead, development branches merge directly into main, reducing complexity while retaining branch isolation, traceability, and controlled integration.

