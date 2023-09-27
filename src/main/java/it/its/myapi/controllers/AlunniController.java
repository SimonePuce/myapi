package it.its.myapi.controllers;

import it.its.myapi.dto.AlunniDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunni")
public class AlunniController {

    @GetMapping(value = "/getAlunni", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AlunniDTO> getAlunni() {
        List<AlunniDTO> alunni = new ArrayList<>();
        alunni.add(new AlunniDTO("Altavilla","Antonio","https://newsicilia.it/wp-content/uploads/2023/04/ChatGPT.jpeg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Avventuroso","Samuele","https://citynews-milanotoday.stgy.ovh/~media/horizontal-mid/52038387048743/milan-6.jpg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Basile","Chiara","https://www.chimica-online.it/anatomia-umana/immagini/sistema-nervoso.png","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Corianò","Antonio","https://www.davidq.it/assets/img/logo.svg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Cuccinelli","Dario","https://media-ys.automobile.it/api/v1/am-ad/images/8f61a242837b8a3d1d4df118aaedcb16?rule=ad-1280.jpeg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Dongiovanni","Emanuele","https://www.frammentirivista.it/wp-content/uploads/2021/01/don-giovanni.png","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Ferrara","Edoardo","https://shorturl.at/hikOS","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Fiore","Renato","https://redhotcyber.it/wp-content/uploads/2022/02/hacker.jpg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Fumarola","Francesco","https://tech.rochester.edu/wp-content/uploads/2015/07/skype-windows-video-call.png","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Gaetani","Lorenzo","https://www.otticabergamo.it/img/negozzi/gazzera/Unknown-13.jpg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Laporta","Eliana","https://media.tenor.com/D9LgDm6r9HoAAAAd/ryback-eating-ruffles-potato-chips-rayback.gif","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Lopalco","Gioele","https://e7.pngegg.com/pngimages/183/160/png-clipart-kingpin-daredevil-marvel-avengers-alliance-bullseye-punisher-wilson-reis-thumbnail.png","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Masiello","Michelangelo","https://shorturl.at/zLR23","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Pedio","Luigi","https://uploads-ssl.webflow.com/5d7e8885cad5174a2fcb98d7/64933f98a477f02e36a282d1_5eddd950e5cf1ec1fa5c2d83_virtual-influencer-john-pork.jpeg","https://www.linkedin.com/in/italy-antoniopanico/"));
        alunni.add(new AlunniDTO("Puce","Simone","https://shorturl.at/mwFLX","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Resta","Christian","https://media.esportsedition.com/wp-content/uploads/2016/07/losingstreak.jpg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Riotti","Matteo","https://shorturl.at/flyIL","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Sicuro","Eugenio","https://upload.wikimedia.org/wikipedia/it/8/84/Parabita-Gonfalone.png?20220324120938","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Tondo","Gianluca","https://www.repstatic.it/content/nazionale/img/2018/09/28/091426918-96796c97-489a-4bef-a84a-3deb546cb350.jpg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Tramis","Stefano","https://e1.pxfuel.com/desktop-wallpaper/220/767/desktop-wallpaper-looking-for-a-spongebob-flying-dutchman-r-requests.jpg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Verdesca","Narcis","https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Narcissus_pseudonarcissus_%28daffodills%29_-_1.jpg/1200px-Narcissus_pseudonarcissus_%28daffodills%29_-_1.jpg","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Vergine","Fabio","https://upload.wikimedia.org/wikipedia/commons/f/fc/Eurobet_Logo1.png","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Vitto","Carlo","https://github.com/alemarra89/its2224/blob/main/alunni/vitto.png?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Zagà","Rocco","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5U06PpdlKhZjdSvrvyiqzexg2k7fomjBhYgSVj85D5g&s","https://www.links-srl.it/"));
        return alunni;
    }

}
