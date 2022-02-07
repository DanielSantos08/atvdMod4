import React from "react";
import Style from "../App.css";
import ImgSalvador from "../components/imagens/Destinos/Salvador-Ba.jpg";
import ImgRioDeJaneiro from "../components/imagens/Destinos/RioDeJaneiro-RJ.jpg";
import ImgSaoPaulo from "../components/imagens/Destinos/sao_paulo.jpg";
import ImgOcean from "../components/imagens/calm_ocean.jpg"
import ImgChapadaVeadeiros from "../components/imagens/Destinos/chapada-dos-veadeiros.jpg"
import ImgNoronha from "../components/imagens/Destinos/fernandodenoronhaPE.jpg"


export default function Home() {
    return (
        <>
        <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img  src={ImgOcean} alt="Primeiro Slide"/>
    </div>
    <div class="carousel-item">
      <img  src={ImgChapadaVeadeiros} alt="Segundo Slide"/>
    </div>
    <div class="carousel-item">
      <img src={ImgNoronha} alt="Terceiro Slide"/>
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
<hr />
<p class="text-center h2"><strong>Mais Buscados</strong></p>
        <div id="passagens">
            <div className="destinos">
                <img src={ImgSalvador} alt="/" className="imgDestinos"/>
                <p><strong>Salvador - BA</strong><br/><sup>Passagem + Hospedagem em Ofertas Imperdiveis!!!</sup></p> 
                <section class="d-flex justify-content-around p-0 m-0">
                <a class="btn btn-success" href="#">Comprar</a> 
                <h3 class="text-center m-0 p-0">R$ 2000<small class="text-muted"><sub><s>4000</s></sub></small></h3>
                </section>
            </div>
            <div className="destinos">
                <img src={ImgRioDeJaneiro} alt="/" className="imgDestinos"/>
                <p><strong>Rio De Janeiro - RJ</strong><br/><sup>Passagem + Hospedagem em Ofertas Imperdiveis!!!</sup></p>
                <section class="d-flex justify-content-around p-0 m-0">
                <a class="btn btn-success" href="#">Comprar</a> 
                <h3 class="text-center m-0 p-0">R$ 2000<small class="text-muted"><sub><s>4000</s></sub></small></h3>
                </section>
            </div>
            <div className="destinos">
                <img src={ImgSaoPaulo} alt="/" className="imgDestinos"/>
                <p><strong>São Paulo - SP</strong><br/><sup>Passagem + Hospedagem em Ofertas Imperdiveis!!!</sup></p>
                <section class="d-flex justify-content-around p-0 m-0">
                <a class="btn btn-success" href="#">Comprar</a> 
                <h3 class="text-center m-0 p-0">R$ 2000<small class="text-muted"><sub><s>4000</s></sub></small></h3>
                </section>
            </div>
        </div>
        <hr />]
        </>
        );
    }   