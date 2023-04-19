public class Aritmetica implements ICalcMedia {

    @Override
    public double Calcular (double P1, double P2) {
        return (P1 + P2) / 2;
    }
    @Override
    public String Descricao (double media); {
        return "Media aritmetica";

    }


}