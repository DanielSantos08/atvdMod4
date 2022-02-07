import React from "react";
import Style from "../App.css";
import ImgSalvador from "../components/imagens/Destinos/Salvador-Ba.jpg";
import ImgRioDeJaneiro from "../components/imagens/Destinos/RioDeJaneiro-RJ.jpg";
import ImgSaoPaulo from "../components/imagens/Destinos/sao_paulo.jpg";
import ImgChapada from "../components/imagens/Destinos/chapada-dos-veadeiros.jpg";
import ImgNoronha from "../components/imagens/Destinos/fernandodenoronhaPE.jpg";
import ImgCuritiba from "../components/imagens/Destinos/Curitiba.jpg";


export default function Produtos() {
    return (
        <>
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
            <div className="destinos">
                <img src={ImgChapada} alt="/" className="imgDestinos"/>
                <p><strong>Chapada dos veadeiros - Go</strong><br/><sup>Passagem + Hospedagem em Ofertas Imperdiveis!!!</sup></p>
                <section class="d-flex justify-content-around p-0 m-0">
                <a class="btn btn-success" href="#">Comprar</a> 
                <h3 class="text-center m-0 p-0">R$ 2000<small class="text-muted"><sub><s>4000</s></sub></small></h3>
                </section>
            </div>
            <div className="destinos">
                <img src={ImgNoronha} alt="/" className="imgDestinos"/>
                <p><strong>Fernando de Noronha - PE</strong><br/><sup>Passagem + Hospedagem em Ofertas Imperdiveis!!!</sup></p>
                <section class="d-flex justify-content-around p-0 m-0">
                <a class="btn btn-success" href="#">Comprar</a> 
                <h3 class="text-center m-0 p-0">R$ 2000<small class="text-muted"><sub><s>4000</s></sub></small></h3>
                </section>
            </div>
            <div className="destinos">
                <img src={ImgCuritiba} alt="/" className="imgDestinos"/>
                <p><strong>São Paulo - SP</strong><br/><sup>Passagem + Hospedagem em Ofertas Imperdiveis!!!</sup></p>
                <section class="d-flex justify-content-around p-0 m-0">
                <a class="btn btn-success" href="#">Comprar</a> 
                <h3 class="text-center m-0 p-0">R$ 2000<small class="text-muted"><sub><s>4000</s></sub></small></h3>
                </section>
            </div>
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
        </>
    );
}