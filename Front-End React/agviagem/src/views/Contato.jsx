import React from "react";

export default function Contato() {
    return (
        <>
            <main class="p-4" >
                <div class="d-flex flex-column mh-100 m-4 p-4 text-center">
                        <strong>Contatos:</strong><br />
                        <a class="p-4" href="mailto:Daniel.Santos@recode.org.br"><i class="material-icons">&#xe0be;</i>E-mail</a>
                        <a class="p-4" href="https://github.com/DanielSantos08" target="_blank"><i class="fa">&#xf09b;</i>Daniel Santos</a>
                </div>
            </main>
        </>
    );
}