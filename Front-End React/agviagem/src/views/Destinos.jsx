import React from "react";
import ImgSalvador from "../components/imagens/Destinos/Salvador-Ba.jpg"
import ImgRioDeJaneiro from "../components/imagens/Destinos/RioDeJaneiro-RJ.jpg";
import ImgSaoPaulo from "../components/imagens/Destinos/sao_paulo.jpg";
import Style from "../App.css"

export default function Destinos() {
    return (
        <>
        
       <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img  src={ImgSaoPaulo} alt="Primeiro Slide"/>
    </div>
    <div class="carousel-item">
      <img  src={ImgRioDeJaneiro} alt="Segundo Slide"/>
    </div>
    <div class="carousel-item">
      <img src={ImgSalvador} alt="Terceiro Slide"/>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Anterior</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Próximo</span>
  </a>
</div>
        </>
    );
}