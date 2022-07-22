
public class PrintTree {
    
    public void print(String startingState, int depth) {
        if (depth == 0) {
            return;
        }
        
        String[] nextMoves = ChessFaker.getNextMoves(startingState);
        
        for (int i = 0; i < nextMoves.length; i++) {
            
            String newBoard = ChessFaker.getNextBoard(startingState,
                nextMoves[i]);
            
            System.out.print(" + " + nextMoves[i] + " = ");
            
            System.out.println(newBoard + " fitness: " + ChessFaker.getFitness(
                newBoard));            
            
            this.print(newBoard, depth - 1);   
        }
        System.out.println();
           
    }
    
    



}
