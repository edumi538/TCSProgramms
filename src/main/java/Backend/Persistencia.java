package Backend;


import DataClass.Piloto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eduardo
 */
public class Persistencia {

    private String nome_arquivo;

    public Persistencia(String value) {

        this.nome_arquivo = value;

    }

    private int quantidadeDePilotos() throws Exception {
        try {
            int quantidade = 0;
            FileReader fr = new FileReader(nome_arquivo);
            BufferedReader bf = new BufferedReader(fr);
            String linha = "";
            while ((linha = bf.readLine()) != null) {
                quantidade++;
            }
            bf.close();
            return quantidade;
        } catch (Exception e) {
            throw e;
        }
    }

    public Iterator ListagemDePilotosArrayList() throws Exception {
        try {
            ArrayList<Piloto> arrayList = new ArrayList<Piloto>();
            FileReader fr = new FileReader(nome_arquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while ((linha = br.readLine()) != null) {
                Piloto aux = new Piloto(linha);
                arrayList.add(aux);
                pos++;
            }
            br.close();
            return arrayList.iterator();
        } catch (Exception e) {
            throw e;
        }
    }

    public Iterator ListagemDePilotosSet() throws Exception {
        try {
            Set<Piloto> listaDePilotos = new HashSet<Piloto>();
            FileReader fr = new FileReader(nome_arquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while ((linha = br.readLine()) != null) {

                Piloto aux = new Piloto(linha);
                listaDePilotos.add(aux);
                pos++;
            }
            br.close();
            return listaDePilotos.iterator();
        } catch (Exception e) {
            throw e;
        }

    }

    public Iterator ListagemDePilotosQueue() throws Exception {
                try {
            Queue<Piloto> listaDePilotos = new LinkedList<Piloto>();
            FileReader fr = new FileReader(nome_arquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while ((linha = br.readLine()) != null) {

                Piloto aux = new Piloto(linha);
                listaDePilotos.add(aux);
                pos++;
            }
            br.close();
            return listaDePilotos.iterator();
        } catch (Exception e) {
            throw e;
        }
    }

    public String getNome_arquivo() {
        return nome_arquivo;
    }

    public void setNome_arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }

}
