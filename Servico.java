
package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Servico extends Cliente{
    
    private int Guiche;
    private int IDCliente;
    private String Veiculo;
    private int Ano;
    private String Modelo;
    private String TipoServico;
    private int Valor;

    public int getGuiche() {
        return Guiche;
    }

    public void setGuiche(int Guiche) {
        this.Guiche = Guiche;
    }

    @Override
    public int getIDCliente() {
        return IDCliente;
    }

    @Override
    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(String Veiculo) {
        this.Veiculo = Veiculo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(String TipoServico) {
        this.TipoServico = TipoServico;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    @Override
    public void Cadastrar(){
        try {
            FileWriter fw = new FileWriter("../CRUD_PRONTO/Servicos/servico"+this.Guiche+".txt",false);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.Guiche);
            pw.println(this.IDCliente);
            pw.println(this.Veiculo);
            pw.println(this.Ano);
            pw.println(this.Modelo);
            pw.println(this.TipoServico);
            pw.println(this.Valor);
            
            pw.flush();
            
            pw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Serviço Cadastrado!");
        } catch (IOException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void Atualizar(){
        try {
            FileWriter fw = new FileWriter("../CRUD_PRONTO/Servicos/servico"+this.Guiche+".txt",false);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.Guiche);
            pw.println(this.IDCliente);
            pw.println(this.Veiculo);
            pw.println(this.Ano);
            pw.println(this.Modelo);
            pw.println(this.TipoServico);
            pw.println(this.Valor);
            
            pw.flush();
            
            pw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Serviço Atualizado!");
        } catch (IOException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Deletar(String Guiche){
        File f = new File("../CRUD_PRONTO/Servicos/servico"+Guiche+".txt");
        f.delete();
        JOptionPane.showMessageDialog(null,"Serviço Deletado!");
    }

}
