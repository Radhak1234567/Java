package vom.xworkz.acessSpecifier.external;

public class BoardStudent { Board board = new Board();

    public void listen(){
        System.out.println(board.color);
        board.write();
    }
}
