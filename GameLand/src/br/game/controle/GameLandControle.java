/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.controle;

import br.game.modelo.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class GameLandControle {

    public void delete(Jogo jogo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from jogo where codigoJogo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, jogo.getCodigoJogo());
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

    public void insert(Jogo jogo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into jogo (nomeJogo, precoJogo, plataformaJogo, generoJogo, descricao, precoVenda, produtora)values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);

            ps.setString(1, jogo.getNomeJogo());
            ps.setDouble(2, jogo.getPrecoJogo());      //Verificar
            ps.setString(3, jogo.getPlataformaJogo());
            ps.setString(4, jogo.getGeneroJogo());
            ps.setString(5, jogo.getDescricao());
            ps.setDouble(6, jogo.getPrecoVenda());
            ps.setString(7, jogo.getProdutora());
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

    public void update(Jogo jogo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update jogo set nomeJogo = ?, precoJogo = ?, plataformaJogo = ?, generoJogo = ? , descricao = ?, precoVenda = ?, produtora = ? where codigoJogo = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, jogo.getNomeJogo());
            ps.setDouble(2, jogo.getPrecoJogo());      //Verificar
            ps.setString(3, jogo.getPlataformaJogo());
            ps.setString(4, jogo.getGeneroJogo());
            ps.setString(5, jogo.getDescricao());
            ps.setDouble(6, jogo.getPrecoVenda());
            ps.setString(7, jogo.getProdutora());
            //Where
            ps.setInt(8, jogo.getCodigoJogo());
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

    public List<Jogo> getJogoPorNome(String nomeJogo) {
        List<Jogo> lista = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigoJogo = ? , nomeJogo = ?, precoJogo = ?, plataformaJogo = ?, generoJogo = ? , descricao = ?, precoVenda = ?, produtora = ? from jogo where nomeJogo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nomeJogo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogo jogo = new Jogo();

                jogo.setCodigoJogo(rs.getInt(1));
                jogo.setNomeJogo(rs.getString(2));
                jogo.setPrecoJogo(rs.getDouble(3));
                jogo.setPlataformaJogo(rs.getString(4));
                jogo.setGeneroJogo(rs.getString(5));
                jogo.setDescricao(rs.getString(6));
                jogo.setPrecoVenda(rs.getDouble(7));
                jogo.setProdutora(rs.getString(8));

                lista.add(jogo);
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
        return lista;
    }

    public Jogo getJogoPorCodigo(int codigoJogo) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from jogo where codigoJogo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigoJogo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogo jogo = new Jogo();

                jogo.setCodigoJogo(rs.getInt("codigoJogo"));
                jogo.setNomeJogo(rs.getString("nomeJogo"));
                jogo.setPrecoJogo(rs.getDouble("precoJogo"));
                jogo.setPlataformaJogo(rs.getString("plataformaJogo"));
                jogo.setGeneroJogo(rs.getString("generoJogo"));
                jogo.setDescricao(rs.getString("descricao"));
                jogo.setPrecoVenda(rs.getDouble("precoVenda"));
                jogo.setProdutora(rs.getString("produtora"));

                return jogo;
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

}
