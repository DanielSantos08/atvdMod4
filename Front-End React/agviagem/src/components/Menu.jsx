import React from "react";
import { Link } from "react-router-dom";

export default function Menu() {
    return (
         <header>
         <nav class="navbar navbar-expand-sm navbar-toggleable-sm navbar-light bg-warning border-bottom  ">
             <div class="container">
                 <a class="navbar-brand" href="/Index">Agência de Viagens</a>
                 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".navbar-collapse" aria-controls="navbarSupportedContent"
                         aria-expanded="false" aria-label="Toggle navigation">
                     <span class="navbar-toggler-icon"></span>
                 </button>
                 <div class="navbar-collapse collapse d-sm-inline-flex justify-content-between">
                     <ul class="navbar-nav flex-grow-1 justify-content-between">
                         <li class="nav-item btn btn-primary">
                         <Link to="/Index" class="nav-link text-white">Home</Link>
                         </li>
                         <li class="nav-item btn btn-primary">
                         <Link to="/Destinos" class="nav-link text-white">Destinos</Link>
                         </li>
                         <li class="nav-item btn btn-primary">
                         <Link to="/Pacotes" class="nav-link text-white">Pacotes</Link>
                         </li>
                         <li class="nav-item btn btn-primary">
                         <Link to="/Contato" class="nav-link text-white">Contato</Link>
                         </li>
                     </ul>
                 </div>
             </div>
         </nav>
     </header>
    );
}