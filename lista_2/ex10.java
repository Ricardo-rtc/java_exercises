public class ex10 {
    public class Caneta {
        // Atributos
        private String cor;
        private String tipo;
        private double ponta;

        // Construtor padrão
        public Caneta() {
            this.cor = "Preta";
            this.tipo = "Esferográfica";
            this.ponta = 0.7; // Diâmetro da ponta em mm
        }

        // Construtor com parâmetros
        public Caneta(String cor, String tipo) {
            this.cor = cor;
            this.tipo = tipo;
            this.ponta = 0.7; // Valor padrão
        }

        // Construtor com todos os parâmetros
        public Caneta(String cor, String tipo, double ponta) {
            this.cor = cor;
            this.tipo = tipo;
            this.ponta = ponta;
        }

        // Métodos de acesso (getters e setters)
        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public double getPonta() {
            return ponta;
        }

        public void setPonta(double ponta) {
            this.ponta = ponta;
        }
    }
}
