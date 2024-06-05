public class SchellingModel {

    public static void main(String[] unused) {
        // Initial Parameters
        int size = 10;
        double similarity = 1;
        double empty = 1;
        double redToBlue = 0.5;

        // Contents of the Grid and the Grid
        int total = size*size;
        int numWhite = (int)(total * empty);
        int numRed = (int)((total - numWhite)*redToBlue);
        int numBlue = total - numWhite - numRed;
        int[][] Grid =  new int[size][size];

        StdDraw.setScale( - 0.5, 9.5);
        StdDraw.enableDoubleBuffering();

        initGrid(Grid, numRed, numBlue);

        StdOut.println(numRed);
        StdOut.println(numBlue);
        StdOut.println(numWhite);

        // Set the scale to match the Grid array


        drawGrid(Grid);

    }

    private static void initGrid(int[][] Grid,int numRed, int numBlue){
        // Start Every Value as empty

        for(int x =0; x < Grid.length; x++){
            for(int y = 0; y < Grid[0].length; y++){
                Grid[x][y] = 0; // 0 = white or empty
            }
        }

        // Fill random grid points for each red and blue

        for(int i=0; i < numRed; i++){
            int x = StdRandom.uniformInt ( Grid.length);
            int y = StdRandom.uniformInt( Grid[0].length);
            if(Grid[x][y] == 0){Grid[x][y] = 1;}
            // Makes sure the random location hasn't been used before then changes to red
        }
        for(int i=0; i < numBlue; i++){
            int x = StdRandom.uniformInt( Grid.length);
            int y = StdRandom.uniformInt( Grid[0].length);
            if(Grid[x][y] == 0){Grid[x][y] = 2;}
            // Makes sure the random location hasn't been used before then changes to blue
        }
        // There is no need to re fill white values since any leftover value will be white
        for(int x=0; x< Grid.length; x++){
            for(int y =0; y < Grid[0].length; y++){
                StdOut.println(Grid[x][y]);
            }
                StdOut.println();
        }
    }

    private static void drawGrid (int[][] Grid){
        StdDraw.clear();

        for(int x = 0; x < Grid.length; x++){
            for (int y =0; y < Grid[0].length; y++ ){
                StdDraw.setPenColor(Color.black);
                StdDraw.square(x,y,.5);
                if(Grid[x][y] == 0){
                    StdDraw.setPenColor(Color.white);
                    StdDraw.filledSquare(x, y, .5);
                }
                else if(Grid[x][y] == 1){
                    StdDraw.setPenColor(Color.red);
                    StdDraw.filledSquare(x, y,.5 );

                }
                else if (Grid[x][y] == 2){
                    StdDraw.setPenColor((Color.blue));
                    StdDraw.filledSquare(x, y, .5);
                }

                }
            }
        StdDraw.show();
        }
