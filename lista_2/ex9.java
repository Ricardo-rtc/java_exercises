public class ex9 {
    public class Relogio {
        // Atributos
        private String marca;
        private String modelo;
        private String cor;
    
        // Construtor padrão
        public Relogio() {
            this.marca = "Desconhecida";
            this.modelo = "Desconhecido";
            this.cor = "Desconhecida";
        }
    
        // Construtor com parâmetros
        public Relogio(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            this.cor = "Desconhecida"; // Valor padrão
        }
    
        // Construtor com todos os parâmetros
        public Relogio(String marca, String modelo, String cor) {
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
        }
    
        // Métodos de acesso (getters e setters)
        public String getMarca() {
            return marca;
        }
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
        public String getModelo() {
            return modelo;
        }
    
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    
        public String getCor() {
            return cor;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }
    }
}
