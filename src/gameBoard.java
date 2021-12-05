import java.util.Scanner;

public class gameBoard {

    private char[][] Board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };
    private String userName;
    private Scanner scnr = new Scanner(System.in);
private String getUserInput;
    public String getGetUserInput() {
        return getUserInput;
    }

    public void setGetUserInput(String getUserInput) {
        this.getUserInput = getUserInput;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

     public void programStart() {
        System.out.println("What is your name?");
        setUserName(scnr.next());

        }
    }
