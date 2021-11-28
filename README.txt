1. Open the tests in intelliJ (IDE which was used)
2. Install the cucumber for Java plugin to open the login.feature file in intelliJ and then view the scenarios
3. Specify the chromedriver absolute path (located within /hudl-task/browser) in /steps/loginSteps for below
   System.setProperty("webdriver.chrome.driver", "chromedriver absolute path goes here");
4. Right click hudl-task -> select open module setting -> ensure all jars are present have been added/imported from those jars in /hudl-task/jar dir
5. Run the scenarios from the feature file -> under Run -> Edit Configuration -> Ensure that glue is set to the 'steps' directory

IMPORTANT:
Before running the tests please fill int he valid password (provided in the text file attached for submission) in the steps that mention
<insert valid password>
otherwise the tests will fail. Thanks.