import java.util.*;

public class Baralho {
    private HashMap<Integer, String> cartas;
    private List<Integer> indicesCartas;
    private Random gerador;

    //constrói o baralho na main
    public Baralho(){
        cartas = new HashMap<>();
        gerador = new Random();
        indicesCartas = new ArrayList<>();
        inicializarCartas();
        embaralharCartas();
    }

    private void inicializarCartas() {

        String[] arcanosMaiores = {
                "O Mago", "A Sacerdotisa", "A Imperatriz", "O Imperador",
                "O Hierofante", "Os Enamorados", "O Carro", "A Força",
                "O Eremita", "A Roda da Fortuna", "A Justiça", "O Pendurado",
                "A Morte", "A Temperança", "O Diabo", "A Torre", "A Estrela",
                "A Lua", "O Sol", "O Julgamento", "O Mundo", "O Louco"
        };

        for (int i = 0; i < arcanosMaiores.length; i++) {
            cartas.put(i + 1, arcanosMaiores[i]);
        }

        String [] naipes = {"Copas", "Ouros", "Espadas", "Paus"};

        String [] valores = {
                "Ás", "Dois", "Três", "Quatro", "Cinco", "Seis",
                "Sete", "Oito", "Nove", "Dez", "Valete", "Cavaleiro",
                "Rainha", "Rei"
        };

        int numero = 23;
        for(String naipe : naipes){
            for(String valor : valores){
                cartas.put(numero, valor + " de " + naipe);
                numero++;
            }
        }

    }

    private void embaralharCartas(){
        indicesCartas.clear();
        for (int i = 1; i <= 78; i++){
            indicesCartas.add(i);
        }
        Collections.shuffle(indicesCartas);
    }

    public void usuarioEmbaralhaCartas(){
        embaralharCartas();
    }

    public void loadingDeEmbaralhamento(){
        System.out.print("\nEmbaralhando cartas");

        try {
            // Animação de pontos se movendo
            for (int i = 0; i < 3; i++) {
                Thread.sleep(400);
                System.out.print(".");
            }

            // Efeito de cartas sendo embaralhadas
            String[] simbolos = {"♠", "♥", "♦", "♣"};
            System.out.print("\n");
            for (int i = 0; i < 15; i++) {
                Thread.sleep(100);
                int randomIndex = gerador.nextInt(simbolos.length);
                System.out.print(simbolos[randomIndex] + " ");
                if ((i + 1) % 5 == 0) System.out.println();
            }

            Thread.sleep(500);
            System.out.println("\nCartas embaralhadas com sucesso!\n");

        } catch (InterruptedException e) {
            System.out.println("\nEmbaralhamento interrompido.");
        }
    }

    public String sortearCarta(){
        if (indicesCartas.isEmpty()){
            embaralharCartas();
        }
        int numeroSorteado = indicesCartas.remove(0);
        return cartas.get(numeroSorteado);
    }

    public String[] sortearTresCartas(){
        if (indicesCartas.size() < 3){
            embaralharCartas();
        }
        String[] resultado = new String[3];
        for (int i = 0; i < 3; i++){
            resultado[i] = sortearCarta();
        }
        return resultado;
    }

    public String[] sortearCruzCelta(){
        if (indicesCartas.size() < 10){
            embaralharCartas();
        }
        String[] cruzCelta = new String[10];
        for(int i = 0; i < 10; i++){
            cruzCelta[i] = sortearCarta();
        }
        return cruzCelta;
    }

}

