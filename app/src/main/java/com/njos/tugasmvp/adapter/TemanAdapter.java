package com.njos.tugasmvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.njos.tugasmvp.R;
import com.njos.tugasmvp.fragment.TemanFragment;
import com.njos.tugasmvp.model.Teman;

import java.util.ArrayList;

//tanggal 18/05/2019
//NIM : 10116040
//NAMA : Anjas Kurnia Sandy
//Kelas : IF 1
public class TemanAdapter  extends BaseAdapter {
    private final Context context;
    private ArrayList<Teman> heroes;

    public void setHeroes(ArrayList<Teman> heroes) {
        this.heroes = heroes;
    }

    public TemanAdapter(Context context) {
        this.context = context;
        heroes = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return heroes.size();
    }

    @Override
    public Object getItem(int i) {
        return heroes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            //Menghubungkan ViewHolder dengan View
            view = LayoutInflater.from(context).inflate(R.layout.item_list_teman, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);

        //Mengubah nilai pahlawan sesuai dari posisinya
        Teman hero = (Teman) getItem(i);
        viewHolder.bind(hero);
        return view;
    }

    private class ViewHolder {
        private TextView txtName;
        private TextView txtNim;
        private TextView txtKelas;
        private TextView txtTelepon;
        private TextView txtEmail;
        private TextView txtSocial;

        ViewHolder(View view) {
            txtName = view.findViewById(R.id.txt_name);
            txtNim = view.findViewById(R.id.txt_nim);
            txtKelas = view.findViewById(R.id.txt_kelas);
            txtTelepon = view.findViewById(R.id.txt_telepon);
            txtEmail = view.findViewById(R.id.txt_email);
            txtSocial = view.findViewById(R.id.text_Social);
        }

        void bind(Teman hero) {
            txtName.setText(hero.getName());
            txtNim.setText(hero.getNim());
            txtKelas.setText(hero.getKelas());
            txtTelepon.setText(hero.getTelepon());
            txtEmail.setText(hero.getEmail());
            txtSocial.setText(hero.getSocial());


        }
    }
}
