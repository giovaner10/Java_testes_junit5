package br.ce.wcaquino.builder;

import br.ce.wcaquino.entidades.Usuario;

public class UsuarioBuilder {

    private Usuario usuario;

    private static UsuarioBuilder usuarioBuilder() {
        UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
        usuarioBuilder.usuario = new Usuario();

        return usuarioBuilder;
    }

    private static Usuario usuario() {

        return usuario();
    }



}
