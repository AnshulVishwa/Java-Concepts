public class TowerOfHanoi {
    public static void tower(int disks , String source , String helper , String destination){
        
        if( disks == 1 ){
            System.out.println("Transfering 1 disk from " + source + " to " + destination);
            return;
        }

        tower( disks-1 , source , destination , helper  );
        System.out.println("Transfering disk " + disks + " from " + source + " to " + destination);
        tower( disks-1 , helper , source , destination );
        
    }
    public static void main( String args[] ){
        tower(5 , "source" , "helper" , "destination");
    }
}
