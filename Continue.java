public class Continue {
    public static void main(String[] args) {
        for (int cont = 1; cont <= 500; cont++) {
            System.out.println("nr: " + cont);
            if(cont==6){
                continue;
            }
        }
    }
}
