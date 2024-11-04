public class ex11 {
    public class Tenis {
        // Atributos
        private String marca;
        private String modelo;
        private String tamanho;
    
        // Construtor padrão
        public Tenis() {
            this.marca = "Desconhecida";
            this.modelo = "Desconhecido";
            this.tamanho = "Desconhecido";
        }
    
        // Construtor com parâmetros
        public Tenis(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            this.tamanho = "Desconhecido"; // Valor padrão
        }
    
        // Construtor com todos os parâmetros
        public Tenis(String marca, String modelo, String tamanho) {
            this.marca = marca;
            this.modelo = modelo;
            this.tamanho = tamanho;
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
    
        public String getTamanho() {
            return tamanho;
        }
    
        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }
    }
}    