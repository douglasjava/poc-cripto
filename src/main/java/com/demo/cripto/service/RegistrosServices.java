package com.demo.cripto.service;

import com.demo.cripto.entity.*;
import com.demo.cripto.repository.EnderecoRepository;
import com.demo.cripto.repository.RegistrosRepository;
import com.demo.cripto.repository.RegsVeiculosRepository;
import com.demo.cripto.utils.DocumentGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegistrosServices {

    private final RegistrosRepository registrosRepository;
    private final RegsVeiculosRepository regsVeiculosRepository;
    private final EnderecoRepository enderecoRepository;

    public void insertMassive(int qtdRegistro, int qtdeVehicle) {

        try {

            log.info("Inserindo {} registros com {} veiculos", qtdRegistro, qtdeVehicle);

            var endereco = enderecoRepository.findById(100).orElseThrow();

            for (int i = 0; i < qtdRegistro; i++) {

                Registros registros = Registros.builder()
                        .idCredor(new Credores(1))
                        .idEndereco(endereco)
                        .idMunicipioContrato(new Municipios(1))
                        .idRemessa(new Remessas(1))
                        .idStatus(new Status(1))
                        .idTipoContrato(new TiposContratos(1))
                        .idUsuarioAtualiza(1)
                        .imCertidaoIteor("Teste".getBytes())
                        .pcCorrecao(BigDecimal.ONE)
                        .pcJurosAno(BigDecimal.ONE)
                        .pcJurosMesCont(BigDecimal.ONE)
                        .tipoOperacao(new TipoOperacao(1))
                        .tpDevedor((short)'0')
                        .tpOrigem((short) '0')
                        .vlRegistro(BigDecimal.TEN)
                        .vlDivida(BigDecimal.TEN)
                        .vlParcela(BigDecimal.TEN)
                        .vlComissao(BigDecimal.ZERO)
                        .vlIof(BigDecimal.ZERO)
                        .vlTxMora(BigDecimal.ZERO)
                        .vlTxMulta(BigDecimal.ZERO)
                        .vlEncargos(BigDecimal.ZERO)
                        .nmDevedor("Teste " + i)
                        .nuContrato("343536767869")
                        .nmDevedor("66786566464")
                        .dsEmail("Teste@test.com.br")
                        .nuCnpj("10146710606")
                        .inMulta(false)
                        .inMora(false)
                        .inAtivo(true)
                        .qtTotalMeses(1)
                        .qtTotalParcelas(1)
                        .pcJurosMesCont(BigDecimal.ONE)
                        .vlComissao(BigDecimal.ZERO)
                        .nmGarantidor("Jose")
                        .inB3(false)
                        .dtUltAtualiza(new Date())
                        .dtContrato(new Date())
                        .dtFimContrato(new Date())
                        .idUsuarioRegistro(new Usuarios(1))
                        .build();

                var registroSaved = registrosRepository.save(registros);


                List<RegsVeiculos> list = new ArrayList<>();
                for (int vehicle = 0; vehicle < qtdeVehicle; vehicle++) {
                    list.add(RegsVeiculos.builder()
                            .idRegistro(registroSaved)
                            .nmCorVeiculo("Cor " + vehicle)
                            .nuChassi("Chassi " + vehicle)
                            .nuRenavam("Renavam " + vehicle)
                            .nuRestricaoSng(1)
                            .nuPlaca("Placa " + vehicle)
                            .idUsuarioAtualiza(1)
                            .inAtivo(true)
                            .nuRegistro("1234")
                            .nuAnoFabrica((short) 2020)
                            .nuAnoModelo((short) 2021)
                            .build());
                }

                regsVeiculosRepository.saveAll(list);

            }

            log.info("Registros {} inseridos com sucesso", qtdRegistro);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Registros> listAllRegistros() {
        return registrosRepository.findAll();
    }

    public List<RegsVeiculos> listAllRegsVeiculosBy() {
        return regsVeiculosRepository.findAll();
    }


}
