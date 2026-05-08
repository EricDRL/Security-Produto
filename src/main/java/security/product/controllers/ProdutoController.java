package security.product.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import security.product.services.ProdutoService;

import java.util.List;

@RestController
@RequestMapping
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<er.sec.models.ProdutoModel> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public er.sec.models.ProdutoModel salvar(@RequestBody er.sec.models.ProdutoModel produto) {
        return service.salvar(produto);
    }

    @GetMapping("/{id}")
    public er.sec.models.ProdutoModel buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }


}
