package Game;

public class Game {

    Tile nullTile = new Tile("?", "White", true, 0);
    Tile floorTile = new Tile(".", "Grey", true, 1);
    Tile wallTile = new Tile("#", "Black", false, 2);

    Tile[] tileIndex = new Tile[]{nullTile, floorTile, wallTile};

    public static void main(String[] args) {
    }

    public Tile[][] makeLayer(int[][] indexMap){
        Tile[][] map =  new Tile[indexMap.length][indexMap[0].length];
        for(int y = 0; y < indexMap.length; y++){
            for(int x = 0; x < indexMap[y].length; x++){
                if(indexMap[y][x] == 0) map[y][x] = nullTile;
            }
        }
        return map;
    }
}