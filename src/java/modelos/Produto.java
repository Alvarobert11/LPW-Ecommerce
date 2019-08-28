package modelos;

import java.util.ArrayList;

public class Produto {
   private String descricao;
   private float preco;
   public static ArrayList<Produto> lista = new ArrayList();

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public float getPreco() {
      return preco;
   }

   public void setPreco(float preco) {
      this.preco = preco;
   }


}
