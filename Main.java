public class Main {

    public static void main(String[] args){
        
        //Data (Json) formato
        String data [][] = {
            {"Juanito","10","1.1","m"},
            {"Juanito", "10", "1.1", "m"},
            {"María", "12", "1.3", "f"},
            {"Luis", "11", "1.25", "m"},
            {"Ana", "10", "1.2", "f"},
            {"Carlos", "13", "1.4", "m"},
            {"Sofía", "12", "1.35", "f"},
            {"Pedro", "11", "1.28", "m"},
            {"Lucía", "10", "1.15", "f"},
            {"Miguel", "12", "1.32", "m"},
            {"Elena", "13", "1.38", "f"},
            {"Tomás", "11", "1.22", "m"}
        }; 

        for( int i = 0 ; i < data.length;i++){
            
            int edad = Integer.parseInt(data[i][1]);
            double altura = Double.parseDouble(data[i][2]);
            char genero = data[i][3].charAt(0);



            Alumno alumno1 = new Alumno(data[i][0], altura, edad, genero);
            alumno1.saludar();
        }

    }
}