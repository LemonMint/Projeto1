/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.controle;

import br.game.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lemon
 */
public class ClienteDao {

    public void insert(Cliente cliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into cliente (nome, email, idade, sexo, cpf, CEP, telefone) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            //ps.setInt(1, cliente.getCodigo());
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setInt(3, cliente.getIdade());
            if (cliente.isSexo()) {
                ps.setBoolean(4, true);
            } else {
                ps.setBoolean(4, false);
            }
            ps.setString(5, cliente.getCpf());
            ps.setInt(6, cliente.getCEP());
            ps.setString(7, cliente.getTelefone());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void delete(Cliente cliente) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from cliente where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Cliente cliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection(); /*nome, email, idade, sexo, cpf, CEP, telefone*/

            String sql = "update cliente set nome = ?, email = ?, idade = ?, sexo = ?, cpf = ?, CEP = ?, telefone = ? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setInt(3, cliente.getIdade());
            if (cliente.isSexo()) {
                ps.setBoolean(4, true);
            } else {
                ps.setBoolean(4, false);
            }
            ps.setString(5, cliente.getCpf());
            ps.setInt(6, cliente.getCEP());
            ps.setString(7, cliente.getTelefone());
            //Where
            ps.setInt(8, cliente.getCodigo());

            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public Cliente getClientePorCodigo(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from cliente where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer cod = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                Integer idade = rs.getInt("idade");
                Boolean sexo = rs.getBoolean("sexo");
                String cpf = rs.getString("cpf");
                Integer cep = rs.getInt("cep");
                String telefone = rs.getString("telefone");

                Cliente cliente = new Cliente();

                cliente.setCodigo(cod);
                System.out.println("codigo setado:" + cod);
                cliente.setNome(nome);
                cliente.setEmail(email);
                cliente.setIdade(idade);
                cliente.setSexo(sexo);
                cliente.setCpf(cpf);
                cliente.setCEP(cep);
                cliente.setTelefone(telefone);
                return cliente;

            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }
    
    public List<Cliente> getClientePorNome(String nomePesquisado) {
        List<Cliente> lista = new ArrayList<Cliente>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select distinct * from cliente where lower(nome) like lower(?)";
            ps = conn.prepareStatement(sql);
            nomePesquisado = "%" + nomePesquisado + "%";
            ps.setString(1, nomePesquisado);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("codigo"));
                System.out.println("codigo setado por nome:" + cliente.getCodigo());
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setIdade(rs.getInt("idade"));
                cliente.setSexo(rs.getBoolean("sexo"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setCEP(rs.getInt("cep"));
                cliente.setTelefone(rs.getString("telefone"));
                
                lista.add(cliente);

            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }
    
    public List<Cliente> getClientePorLista() {
        List<Cliente> lista = new ArrayList<Cliente>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from cliente";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("codigo"));
                System.out.println("codigo setado por nome:" + cliente.getCodigo());
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setIdade(rs.getInt("idade"));
                cliente.setSexo(rs.getBoolean("sexo"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setCEP(rs.getInt("cep"));
                cliente.setTelefone(rs.getString("telefone"));
                
                lista.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    

}
