
package Ejercicios;

public class ExtrasN12 {

    public static void main(String[] args) {
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int w=0;w<10;w++){
                    
                    if(i==3){
                        System.out.println("E" + "-" + j + "-" + w);
                    } else {
                        if(j==3){
                            System.out.println(i + "-" + "E" + "-" + w);
                        } else {
                            if(w==3){
                                System.out.println(i + "-" + j + "-" + "E");
                            } else {
                                System.out.println(i + "-" + j + "-" + w);
                            }
                        }
                    }
                }
            }
        }
    }
}
