package org.example;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class FirstElementQuestionController {

    public GridPane periodicTablePane;

    public void initialize(){

        int columns = 18;
        int rows = 9;
//The periodic table will be built on 3 blocks.
// There will be 2 formats: element, empty, element for row 1-6, and empty, element, empty for rows 7-8
        //the first index 0 is an element, second index 1 is nothing, third index 2 is an element
        //last two rows will do the opposite: Empty, element, empty.
        int empties[][] ={
                {1,16,1}, //1 element, 16 empty, and 1 element. Total of 18 per row
                {2,10,6},
                {2,10,6}, //2 elements, 10 empty, and 6 elements. Total of 18 per row.
                {18,0,0},
                {18,0,0}, //18 elements. represents full row
                {18,0,0},
                {18,0,0},
                {3,14,1}, //3 empty, 14 elements, 1 empty
                {3,14,1}};

        String gridArray[][] = new String[rows][columns];

        int columnSelector = 0; //The selected column index 0, 1 or 2. So we know if we add an element or not.
        int elementCounter = 0; //Used to count how many elements will be added
        int currentElement = 1;
        for(int COUNTR = 0; COUNTR< rows; COUNTR++){ //For each row
            for(int COUNTC = 0; COUNTC< columns; COUNTC++) { // For each column

                if(COUNTR<7) { //Only for the first 6 rows (because the last 2 are inverted)
                    //Instead of fill, empty, fill. The last 2 rows are "empty, fill, empty".
                    switch (columnSelector) { //To identify which portion of the row we are in.
                        case 0:
                        case 2:
                            gridArray[COUNTR][COUNTC] = "x"; //Adds element
                            StackPane ele = new StackPane();
                            ele.getChildren().add(new Text(App.elementsList.get(currentElement).getSymbol()));
                            periodicTablePane.add(ele, COUNTC,COUNTR);
                            currentElement++;
                            break;
                        case 1:
                            gridArray[COUNTR][COUNTC] = "-"; //No element
                            break;
                    }
                }else{ //If it is not row 1-6 (it is row 7-8)
                    switch (columnSelector) {
                        case 0:
                            gridArray[COUNTR][COUNTC] = "-"; // No element
                            break;
                        case 1:
                            gridArray[COUNTR][COUNTC] = "x"; //Adds element
                            StackPane ele = new StackPane();
                            ele.getChildren().add(new Text(App.elementsList.get(currentElement).getSymbol()));
                            periodicTablePane.add(ele, COUNTC,COUNTR);
                            currentElement++;
                            break;
                        case 2:
                            gridArray[COUNTR][COUNTC] = "-"; //No element
                            break;
                    }
                }

                elementCounter++; //Add to the elementCounter because something happened.

                //If the empties index is the same as the number of elements counted, it goes to the next index
                if (empties[COUNTR][columnSelector]==elementCounter){
                    columnSelector++; //Adds 1 to selector to go to next index.
                    elementCounter=0; //Resets counter so it begins counting elements again
                }

                if(columnSelector==3 || empties[COUNTR][columnSelector]==0){ //If at the end of the empties row (0,1,2)
                    //or the empties selector is 0, for example {18,0,0},
                    columnSelector=0; //reset to start as 18 elements/non elements have been added to the row
                }

            }

        }

        for(String[] row : gridArray) {
            printRow(row);
        }
    }

    public static void printRow(String[] row) {
        for (String i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();

    }
}
