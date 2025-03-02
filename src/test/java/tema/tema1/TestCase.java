package tema.tema1;

import org.testng.annotations.Test;

public class TestCase {
    //testCaseID (int)
    //title (String)
    //description (String)
    //preconditions (String)
    //stepsToReproduce (String)
    //expectedResult (String)
    //actualResult (String)
    //priority (String)
    //status (String)
    //createdBy (String)
    //assignedTo (String)
    //lastUpdated (date)
    //tags (String)
    //automationStatus (boolean)
    //executionTime (double)

    public int testCaseID;
    public String title;
    public String description;
    public String[] preconditions;
    public String[] stepsToReproduce;
    public String expectedResult;
    public String actualResult;
    public String priority;
    public String status;
    public String createdBy;
    public String assignedTo;
    public String lastUpdate;
    public String[] tags;
    public boolean automationStatus;
    public double executionTime;

    @Test
    public void testCaseDetails() {
        testCaseID = 1;
        title = "Login functionality - Correct credentials";
        description = "Login into account using correct credentials.";
        preconditions = new String[]{
          "user: test",
          "password: test123"
        };
        stepsToReproduce = new String[]{
          "Access login page.",
          "Type user and password.",
          "Click on login button.",
          "Check if url contains /account-information."
        };
        expectedResult = "You should login into account and see yor information.";
        actualResult = "You're on login page.";
        priority = "High";
        status = "To do";
        createdBy = "Product owner";
        assignedTo = "QA";
        lastUpdate = "2025-01-13";
        tags = new String[]{
             "Login functionality",
             "Login user"
        };
        automationStatus = true;
        executionTime = 12;

        System.out.println("Test case ID: " + testCaseID);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Preconditions:");
        for(String precondition: preconditions) {
            System.out.println("- "+ precondition);
        };
        System.out.println("Steps to reproduce:");
        for (String step: stepsToReproduce){
            System.out.println("- " + step);
        };
        System.out.println("Expected result: "+ expectedResult);
        System.out.println("Actual result: "+ actualResult);
        System.out.println("Priority: "+ priority);
        System.out.println("Status: "+ status);
        System.out.println("Created by: "+ createdBy);
        System.out.println("Assigned to: "+ assignedTo);
        System.out.println("Last update: "+lastUpdate);
        System.out.println("Tags:");
        for (String tag : tags){
            System.out.println("- "+ tag);
        };
        System.out.println("Automation status:" + automationStatus);
        System.out.println("Execution time(ms): "+ executionTime);
    }



}
