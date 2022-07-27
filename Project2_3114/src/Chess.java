// On my honor:
// - I have not used source code obtained from another student,
// or any other unauthorized source, either modified or
// unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project
// with anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.
/**
 * main class
 * 
 * @author yindrew and hadenlee
 * @version 2022.07.25
 */
public class Chess {

    /**
     * main
     * 
     * @param args
     *            input
     */
    public static void main(String[] args) {

        if (args.length == 0 || args.length > 3) {

            throw new IllegalArgumentException();

        }
        else if (args.length == 1) {

            new BFS(args[0]).print();

        }
        else if (args.length == 2) {

            new PrintTree(args[0], args[1]).print();

        }
        else if (args.length == 3) {

            new DFS(args[0], args[1], args[2]).print();
        }
    }

}
