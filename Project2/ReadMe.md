All the java files for coding and testing are in the right directory as indicated by project2 writeup.
The test-logs are located in testing folder inside project2 directory along with all other csv files as indicated by the project writeup.

Java files location: (repo-Team24/Project2/src)
Testing logs location: (repo-Team24/Project2/testing)
                                             Compilation and Running Our program(Use a Linux terminal For This Part)
                                             
Compilation: javac Main.java

Running the Program: You must input one or more files as indicated by the two different examples below.

1) java Main file1

OR

2) java Main file1 file2 file3

When you run the program, you can input one file or more than one files as shown above. 
This is how you can input multiple csv input files into the program in an efficient manner as indicated above.

Please note that file1,file2,file3, are all file paths to the actually files.

                                             Unit testing and System testing For Our Program
                                                              
 In order to run automated tests, run JUnit tests in Intellij. All test classes are labeled as ClassName_Test.java in the src folder.
We need to have the packages necessary to run Junit so if you guys already have it, you guys can skip the steps and go directly to testing. The Testing logs in the testing folder should have the name of each unit or fucntionality(function/method) that was tested.

We are going to try to add org.junit to our class file path in order for us to be able to do automated unit testing. We struggled with this so we have come up with two ways to do this. You can also add the org.junit to the class file path if you know how to do that yourself. You need to add junit to the file path in order to be able to run tests in your environment.
 
 
First way(BEST WAY: We did it This way and it works so please use the 5 steps below.)
Steps: 
1) Open up IntelliJ on the repo-Team24(Preffered) or the Project2. Click open(If it prompts you to open as project then do it, other wise don't wory about it. <br/>
2) Once IntelliJ is Open, first go to the top left hand corner and click on File.  <br/>
3) Click on Project Structure.  <br/>
4) Go to the "Libraries" group, click the little green plus (look up), and choose "From Maven...".  <br/>
5) Next, search for "junit" and select a version that is 4 or above. We chose junit:junit:4.13.2. Don't choose anything that says Snap shot.
Do not select the download option as you don't want to do that. If the download option is clicked(ticked), then make sure that it is not selected. Simply click ok.
Hit Apply and OK. Keep hitting OK until you're back to the code.
Now, You can simply Try running the tests by going to their respective files and pressing the little green play button which should appear next to each testing class in each testing file.
 
If this does not work, you can try an alternative method.

Second way
Steps: 
Build the Program(You may have errors)
Go to a testing file
Put your cursor on any one of the import org.junit statements on the top of any one of the testing files if there is an error showing.
IntelliJ will have a Red bulb to the left and it will suggest you to add Junit into the class path if you click on it.
We want to add junit into our class file path so we can run our unit tests.
 
To Run Our Unit tests, Please Use IntelliJ. There should be a green play button available for every test and you can also run all the tests for a class at once by clicking on the green play button next to the class name.


                                                           Testing Logs:
Please refer to the testing logs which will indicate what we did to test the new functionality and code we added specifically for Project2. The testing logs will also give information whether the tests passed or failed.
Please not that the older code already has unit testing in place and you can refer to older testing folder in Project1 and the testing logs present there.
We only did testing logs for the new testing we performed in Project2. Please refer to the testing log located in the testing folder.
(Directory Location:repo-Team24/Project2/testing)
