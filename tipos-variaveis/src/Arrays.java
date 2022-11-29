public class Arrays {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 5};
        
        System.out.print("Vetor: ");
        int count = 0;

        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
            System.out.print("Vetor: ");
        for(int i = (vetor.length - 1); i >= 0; i-- ) {
            System.out.print(vetor[i] + " ");
        }
    }
}
