/**
 * prints out the various branches of the tree up till a certain depth
 * 
 * @author yindrew
 * @version 2021.07.25
 */
public class PrintTree {
    private String startingState;
    private int depth;

<<<<<<< HEAD
    /**
     * constructor for PrintTree
     * 
     * @param startingState
     *            the initial board state
     * @param depth
     *            the path up to the current game state
     */
=======
    
    

    

    public void print1(String startingState, int depth, String parent) {

>>>>>>> 2464f61a621b69c66f7c28828d395027359c5875
    public PrintTree(String startingState, String depth) {
        this.startingState = startingState;
        this.depth = Integer.parseInt(depth);
    }
    
<<<<<<< HEAD
    /**
     * prints out the tree
     */
    public void print() {
        System.out.println(startingState + " fitness: " + ChessFaker.getFitness(
            startingState));
        recursive(startingState, depth, "");
    }


    /**
     * recursive call to help print
     * 
     * @param startingState
     *            the initial board state
     * @param depth
     *            number of moves maximum
     * @param parent
     *            the path up the the current game state
     */
    private void recursive(String startingState, int depth, String parent) {
=======
    public void print(String startingState, int depth) {

>>>>>>> 2464f61a621b69c66f7c28828d395027359c5875
        if (depth == 0) {
            return;
        }
        String[] nextMoves = ChessFaker.getNextMoves(startingState);

        for (int i = 0; i < nextMoves.length; i++) {

            String newBoard = ChessFaker.getNextBoard(startingState,
                nextMoves[i]);

            System.out.print(parent + " + " + nextMoves[i] + " = ");

            System.out.println(newBoard + " fitness: " + ChessFaker.getFitness(
                newBoard));

            recursive(newBoard, depth - 1, parent + " + " + nextMoves[i]);
        }
    }

}
