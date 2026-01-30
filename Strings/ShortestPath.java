public class ShortestPath {
    public static float getShortestPath( String path){
        int x = 0;
        int y = 0;

        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            // North 
            if(dir == 'N' || dir == 'n'){
                y++;
            }

            // South
            else if(dir == 'S' || dir == 's'){
                y--;
            }

            // East
            else if (dir == 'E' || dir == 'e'){
                x++;
            }

            // West
            else if(dir == 'W' || dir == 'w'){
                x--;
            }
        }



        return (float) Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float shortestPath = getShortestPath(path);
        System.out.println("The shortest path length is: " + shortestPath);
    }
    
}
