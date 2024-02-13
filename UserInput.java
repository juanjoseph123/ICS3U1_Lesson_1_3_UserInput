class UserInput extends ConsoleProgram {
  
  public void run() {
    
    // Declare variables
    String strName;
    int intAge;
    double dblCurrentMark;
    boolean blnAssignedLocker;

    //Assign variable to user input
    strName = readLine("Enter your name: ");
    System.out.println("Name: " + strName);

    intAge = readInt("Enter your age:");
    System.out.println("Age: " + intAge);
    
    dblCurrentMark = readDouble("Enter your current mark:");
    System.out.println("Current Mark: " + dblCurrentMark);

    blnAssignedLocker = readBoolean("Have you been assigned a locker:");
    System.out.println("Locker Assigned: " + blnAssignedLocker);
    
  }
}
