package com.devifsc.estagiario.appeventos.IHC;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.devifsc.estagiario.appeventos.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.devifsc.estagiario.appeventos.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dia30Fragment extends Fragment {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dia30, container, false);

        expListView = (ExpandableListView) v.findViewById(R.id.elvDia30);
        prepareListData();
        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);

        return  v;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        // Adding child data
        listDataHeader.add("08:30 - 11:30");
        listDataHeader.add("11:30 - 13:30");
        listDataHeader.add("13:30 - 16:30");
        listDataHeader.add("19:00 - 22:00");
        // Adding child data
        List<String> horario1 = new ArrayList<String>();
        horario1.add("Evento: Palestra\nTema: O capital financeiro e o Ensino Superior no Brasil.\nPalestrante: Prof. Ms. Allan Kenji Seki (Doutorando/Educação/UFSC)\nVagas: 40");
        horario1.add("Evento: Palestra\nTema: A arte de viver com foco, confiança e bem-estar, dentro e fora da escola\nPalestrante: Profa. Dra. Maressa D. Dolzan(IFSC)\nPalestrante: Michelle K. Vianna(Terapeuta Holística e Life Coaching)\nVagas: 30");
        horario1.add("Evento: Palestra\nTema: Retrato e representação (Fotografia) II\nPalestrante: Profa. Msa. Maria Lucila Hom (Doutoranda/PPGE/UDESC)\nPalestrante: Profa. Msa. Micheline Barros(IFSC)\nVagas: 20");
        horario1.add("Evento: Palestra\nTema: Experiência das ocupações estudantis de 2016 no estado do Paraná: mobilizações possíveis e necessárias.\nPalestrante: Lucas Luan Gomes(DCE/UNIOESTE)\nVagas: 150");
        horario1.add("Evento: Roda de Conversa II \nTema: GRAFFITI\nMediador: Dharla Raupp Kamers(Artista - CURA)\nMediador: Rafael Ferreira da Silva(Artista - CURA)");
        horario1.add("Evento: Palestra\nTema: História da [bi]ssexualidade: o que temos feito de nós?\nPalestrante: Profa. Msa. Izabel Rizzi Mação(UFES)\nPalestrante: Prof. Dr. Davis Moreira Alvim(IFES)\nVagas: 40");
        List<String> horario2 = new ArrayList<String>();
        horario2.add("Evento: Atividades Culturais\n");
        List<String> horario3 = new ArrayList<String>();
        horario3.add("Evento: Palestra\nTema: Mulheres e Homens, entre o Público e o Privado\nPalestrante: Quéli Flach Anschau(Doutoranda/UFSC/PPGSS)\nPalestrante: Msa. Patrícia Maccar(Assistente social/IFSC)\nVagas: 40");
        horario3.add("Evento: Palestra\nTema: Homossexualidade como posição de sujeitos: problematizações sobre resistências e assujeitamento à heteronormatividade em contexto de cidades pequenas atravessadas pela ruralidade\nPalestrante: Prof. Ms. Emerson Martins(UFFS)\nVagas: 40");
        horario3.add("Evento: Palestra\nTema: Religiosidade afro-brasileira na escola\nPalestrante: Babalorisã Ricardo Osanha Agué\nVagas: 100");
        horario3.add("Evento: Palestra\nTema: Oficina de RAP\nPalestrante: Fabrício ATAK (Militante do movimento hip-hop)\nVagas: 100");
        horario3.add("Evento: Palestra\nTema: Educação e desenvolvimento territorial\nPalestrante: Prof. Esp. Mauro Antônio do Nascimento(IFSC)\nPalestrante: Arnaldo Luiz Milan(Economista e Assessor Territorial)\nPalestrante: Gabriela Lader(Engenheira Agrônoma e Assessora Territorial)\nVagas: 40");
        List<String> horario4 = new ArrayList<String>();
        horario4.add("Evento: Mesa de debate - ENCERRAMENTO\nTema: Educação e diversidades.\nPalestrante: Jorge Senna(Militante Direitos Humanos)\nPalestrante: Prof(a). Ms(a). Izabel Rizzi Mação (UFES)\nPalestrante: Prof. Ms. Emerson Martins(UFFS)\nCoordenadora: Msa. Patrícia Maccar (Assistente social/IFSC)");
        listDataChild.put(listDataHeader.get(0), horario1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), horario2);
        listDataChild.put(listDataHeader.get(2), horario3); // Header, Child data
        listDataChild.put(listDataHeader.get(3), horario4);
    }

}
