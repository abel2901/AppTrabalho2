package com.example.android.apptrabalho2;

import android.os.Parcel;
import android.os.Parcelable;

public class Disciplina implements Parcelable {

    private Integer codigo;
    private String descricao;
    private Integer cargaHoraria;

    protected Disciplina(Parcel in) {
        if (in.readByte() == 0) {
            codigo = null;
        } else {
            codigo = in.readInt();
        }
        descricao = in.readString();
        if (in.readByte() == 0) {
            cargaHoraria = null;
        } else {
            cargaHoraria = in.readInt();
        }
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " Descrição: " +
                descricao + " Carga Horaria: " + cargaHoraria;
    }

    public static final Creator<Disciplina> CREATOR = new Creator<Disciplina>() {
        @Override
        public Disciplina createFromParcel(Parcel in) {
            return new Disciplina(in);
        }

        @Override
        public Disciplina[] newArray(int size) {
            return new Disciplina[size];
        }
    };

    public Disciplina() {

    }

    public Double calculaHora() {
        Double hora = (double) this.cargaHoraria * 50 / 60;
        return hora;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (codigo == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(codigo);
        }
        parcel.writeString(descricao);
        if (cargaHoraria == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(cargaHoraria);
        }
    }

    /*Dentro do pacote desse aplicativo, crie uma classe chamada Disciplina, com os
    seguintes atributos: codigo (Integer), descricao (String), cargaHoraria
    (Integer). Levando em conta que a carga horária da disciplina é dada em
    hora/aula de 50 minutos, crie um método para transformar a carga horária de
    cada disciplina em hora relógio de 60 minutos, esse método deve retornar um
    valor do tipo double. */

}
