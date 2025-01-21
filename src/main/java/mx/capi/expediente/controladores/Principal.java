package mx.capi.expediente.controladores;

import mx.capi.expediente.Modelo.Expediente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {
    // Solicita la raiz del sistema
    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @GetMapping("/expedientes")
    public String getExpedientes(Model model) {
        Expediente exp = new Expediente(1014,"AlimentosvsJuan", "Algo mas largo");
        model.addAttribute("expediente", exp);
        return "expedientes";
    }

}