public class Stairs extends GameSquare
{
    public Stairs()
    {
    }

    public Stairs(SquareType t, int r, int c)
    {
        type = t;
        row = r;
        column = c;
        strValue = "W";
        shape = new Right(SHAPE_SIDE, CENTER_X + SHAPE_SIDE * (column + 1), CENTER_Y + SHAPE_SIDE * (row + 1), Color.ORANGE);
    }
}