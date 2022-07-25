
public class Chess {

    public static void main(String[] args) {
        
        if (args.length == 0 || args.length > 3) {
            
            throw new IllegalArgumentException();
            
        } else if (args.length == 1) {

            new BFS(args[0]);

        } else if (args.length == 2) {
            
            new PrintTree(args[0], args[1]);

        } else if (args.length == 3) {

            new DFS(args[0], args[1], args[2]);
        }
    }

}
