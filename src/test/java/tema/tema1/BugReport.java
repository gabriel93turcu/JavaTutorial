package tema.tema1;

import org.testng.annotations.Test;

public class BugReport {
    //bugID (int)
    //summary (String)
    //description (String)
    //severity (String)
    //priority (String)
    //stepsToReproduce (String[])
    //expectedBehavior (String)
    //actualBehavior (String)
    //environment (String)
    //reportedBy (String)
    //assignedTo (Sting)
    //status (String)
    //dateReported (String)
    //dateResolved (String)
    //resolution (String)

    public int bugID;
    public String summary;
    public String description;
    public String severity;
    public String priority;
    public String[] stepsToReproduce;
    public String expectedBehavior;
    public String actualBehavior;
    public String environment;
    public String reportedBy;
    public String assignedTo;
    public String status;
    public String dateReported;
    public String dateResolved;
    public String resolution;

    @Test
    public void displayBugReport() {
        bugID = 1;
        summary = "500 Internal Server Error";
        description = "Returns error 500 when access the site.";
        severity = "Critical";
        priority = "High";
        stepsToReproduce = new String[]{
                "Open the site",
                "See the error returned"
        };
        expectedBehavior = "The site should be loading and working.";
        actualBehavior = "The site return error 500 when accessing.";
        environment = "Chrome, macOS Monterey, version 12.6.3";
        reportedBy = "Gabi";
        assignedTo = "Dani";
        status = "Resolved";
        dateReported = "2025-01-12";
        dateResolved = "2025-01-12";


        System.out.println("Bug id is: " + bugID);
        System.out.println("Summary: " + summary);
        System.out.println("Description: " + description);
        System.out.println("Severity: " + severity);
        System.out.println("Priority: " + priority);
        System.out.println("Steps to reproduce: ");
        for (String step : stepsToReproduce) {
            System.out.println("- " + step);
        }
        System.out.println("Expected behavior: " + expectedBehavior);
        System.out.println("Actual behavior: " + actualBehavior);
        System.out.println("Environment: " + environment);
        System.out.println("Reported by: " + reportedBy);
        System.out.println("Assigned to: " + assignedTo);
        System.out.println("Status: " + status);
        System.out.println("Date reported: " + dateReported);
        System.out.println("Date resolved: " + dateResolved);
        System.out.println("Resolution: " + resolution);

    }


}
