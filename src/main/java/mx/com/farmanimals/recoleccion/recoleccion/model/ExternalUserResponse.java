package mx.com.farmanimals.recoleccion.recoleccion.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalUserResponse {
    @JsonProperty("numEmpleado")
    private int numEmpleado;
    @JsonProperty("clvUsuario")
    private String clvUsuario;
    @JsonProperty("nombreUsuario")
    private String nombreUsuario;
    @JsonProperty("apPaterno")
    private String apPaterno;
    @JsonProperty("apMaterno")
    private String apMaterno;
    @JsonProperty("estaActivo")
    private boolean estaActivo;
    @JsonProperty("esEmpleado")
    private boolean esEmpleado;
    @JsonProperty("clvPuesto")
    private ClvPuesto clvPuesto;
    @JsonProperty("clvSucursal")
    private ClvSucursal clvSucursal;
    @JsonProperty("clvArea")
    private ClvArea clvArea;
    @JsonProperty("logged")
    private boolean logged;
    @JsonProperty("intentos")
    private int intentos;
    @JsonProperty("fechaexp")
    private String fechaexp;
    @JsonProperty("huelladig")
    private boolean huelladig;
    @JsonProperty("clvestatus")
    private int clvestatus;
    @JsonProperty("fechareg")
    private String fechareg;
    @JsonProperty("numAdam")
    private int numAdam;

    // Getters y Setters

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getClvUsuario() {
        return clvUsuario;
    }

    public void setClvUsuario(String clvUsuario) {
        this.clvUsuario = clvUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    public ClvPuesto getClvPuesto() {
        return clvPuesto;
    }

    public void setClvPuesto(ClvPuesto clvPuesto) {
        this.clvPuesto = clvPuesto;
    }

    public ClvSucursal getClvSucursal() {
        return clvSucursal;
    }

    public void setClvSucursal(ClvSucursal clvSucursal) {
        this.clvSucursal = clvSucursal;
    }

    public ClvArea getClvArea() {
        return clvArea;
    }

    public void setClvArea(ClvArea clvArea) {
        this.clvArea = clvArea;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getFechaexp() {
        return fechaexp;
    }

    public void setFechaexp(String fechaexp) {
        this.fechaexp = fechaexp;
    }

    public boolean isHuelladig() {
        return huelladig;
    }

    public void setHuelladig(boolean huelladig) {
        this.huelladig = huelladig;
    }

    public int getClvestatus() {
        return clvestatus;
    }

    public void setClvestatus(int clvestatus) {
        this.clvestatus = clvestatus;
    }

    public String getFechareg() {
        return fechareg;
    }

    public void setFechareg(String fechareg) {
        this.fechareg = fechareg;
    }

    public int getNumAdam() {
        return numAdam;
    }

    public void setNumAdam(int numAdam) {
        this.numAdam = numAdam;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ClvPuesto {
        @JsonProperty("clvPuesto")
        private int clvPuesto;
        @JsonProperty("descripcion")
        private String descripcion;
        @JsonProperty("estaActivo")
        private boolean estaActivo;

        // Getters y Setters

        public int getClvPuesto() {
            return clvPuesto;
        }

        public void setClvPuesto(int clvPuesto) {
            this.clvPuesto = clvPuesto;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public boolean isEstaActivo() {
            return estaActivo;
        }

        public void setEstaActivo(boolean estaActivo) {
            this.estaActivo = estaActivo;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ClvSucursal {
        @JsonProperty("clvSucursal")
        private int clvSucursal;
        @JsonProperty("descripcion")
        private String descripcion;
        @JsonProperty("calleyNum")
        private String calleyNum;
        @JsonProperty("colonia")
        private String colonia;
        @JsonProperty("codigoPostal")
        private int codigoPostal;
        @JsonProperty("estaActivo")
        private boolean estaActivo;
        @JsonProperty("clvEstado")
        private ClvEstado clvEstado;
        @JsonProperty("clvPoblacion")
        private ClvPoblacion clvPoblacion;
        @JsonProperty("clvPais")
        private int clvPais;
        @JsonProperty("sucursalAdo")
        private SucursalAdo sucursalAdo;
        @JsonProperty("telefono")
        private int telefono;
        @JsonProperty("fax")
        private int fax;
        @JsonProperty("lada")
        private int lada;
        @JsonProperty("entradaCompra")
        private boolean entradaCompra;
        @JsonProperty("fondofijo")
        private double fondofijo;
        @JsonProperty("ivaDiferenciado")
        private boolean ivaDiferenciado;
        @JsonProperty("leyenda")
        private String leyenda;
        @JsonProperty("idformatopublic")
        private int idformatopublic;
        @JsonProperty("maximofaltante")
        private double maximofaltante;
        @JsonProperty("guardaequipaje")
        private boolean guardaequipaje;
        @JsonProperty("clvsucursaljde")
        private String clvsucursaljde;
        @JsonProperty("tiposucursal")
        private int tiposucursal;
        @JsonProperty("tiponegocio")
        private int tiponegocio;

        // Getters y Setters

        public int getClvSucursal() {
            return clvSucursal;
        }

        public void setClvSucursal(int clvSucursal) {
            this.clvSucursal = clvSucursal;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getCalleyNum() {
            return calleyNum;
        }

        public void setCalleyNum(String calleyNum) {
            this.calleyNum = calleyNum;
        }

        public String getColonia() {
            return colonia;
        }

        public void setColonia(String colonia) {
            this.colonia = colonia;
        }

        public int getCodigoPostal() {
            return codigoPostal;
        }

        public void setCodigoPostal(int codigoPostal) {
            this.codigoPostal = codigoPostal;
        }

        public boolean isEstaActivo() {
            return estaActivo;
        }

        public void setEstaActivo(boolean estaActivo) {
            this.estaActivo = estaActivo;
        }

        public ClvEstado getClvEstado() {
            return clvEstado;
        }

        public void setClvEstado(ClvEstado clvEstado) {
            this.clvEstado = clvEstado;
        }

        public ClvPoblacion getClvPoblacion() {
            return clvPoblacion;
        }

        public void setClvPoblacion(ClvPoblacion clvPoblacion) {
            this.clvPoblacion = clvPoblacion;
        }

        public int getClvPais() {
            return clvPais;
        }

        public void setClvPais(int clvPais) {
            this.clvPais = clvPais;
        }

        public SucursalAdo getSucursalAdo() {
            return sucursalAdo;
        }

        public void setSucursalAdo(SucursalAdo sucursalAdo) {
            this.sucursalAdo = sucursalAdo;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public int getFax() {
            return fax;
        }

        public void setFax(int fax) {
            this.fax = fax;
        }

        public int getLada() {
            return lada;
        }

        public void setLada(int lada) {
            this.lada = lada;
        }

        public boolean isEntradaCompra() {
            return entradaCompra;
        }

        public void setEntradaCompra(boolean entradaCompra) {
            this.entradaCompra = entradaCompra;
        }

        public double getFondofijo() {
            return fondofijo;
        }

        public void setFondofijo(double fondofijo) {
            this.fondofijo = fondofijo;
        }

        public boolean isIvaDiferenciado() {
            return ivaDiferenciado;
        }

        public void setIvaDiferenciado(boolean ivaDiferenciado) {
            this.ivaDiferenciado = ivaDiferenciado;
        }

        public String getLeyenda() {
            return leyenda;
        }

        public void setLeyenda(String leyenda) {
            this.leyenda = leyenda;
        }

        public int getIdformatopublic() {
            return idformatopublic;
        }

        public void setIdformatopublic(int idformatopublic) {
            this.idformatopublic = idformatopublic;
        }

        public double getMaximofaltante() {
            return maximofaltante;
        }

        public void setMaximofaltante(double maximofaltante) {
            this.maximofaltante = maximofaltante;
        }

        public boolean isGuardaequipaje() {
            return guardaequipaje;
        }

        public void setGuardaequipaje(boolean guardaequipaje) {
            this.guardaequipaje = guardaequipaje;
        }

        public String getClvsucursaljde() {
            return clvsucursaljde;
        }

        public void setClvsucursaljde(String clvsucursaljde) {
            this.clvsucursaljde = clvsucursaljde;
        }

        public int getTiposucursal() {
            return tiposucursal;
        }

        public void setTiposucursal(int tiposucursal) {
            this.tiposucursal = tiposucursal;
        }

        public int getTiponegocio() {
            return tiponegocio;
        }

        public void setTiponegocio(int tiponegocio) {
            this.tiponegocio = tiponegocio;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ClvEstado {
            @JsonProperty("clvEstado")
            private int clvEstado;
            @JsonProperty("estaActivo")
            private boolean estaActivo;
            @JsonProperty("clvPais")
            private int clvPais;

            // Getters y Setters

            public int getClvEstado() {
                return clvEstado;
            }

            public void setClvEstado(int clvEstado) {
                this.clvEstado = clvEstado;
            }

            public boolean isEstaActivo() {
                return estaActivo;
            }

            public void setEstaActivo(boolean estaActivo) {
                this.estaActivo = estaActivo;
            }

            public int getClvPais() {
                return clvPais;
            }

            public void setClvPais(int clvPais) {
                this.clvPais = clvPais;
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ClvPoblacion {
            @JsonProperty("idPoblacion")
            private int idPoblacion;
            @JsonProperty("pais")
            private int pais;
            @JsonProperty("estaActivo")
            private boolean estaActivo;
            @JsonProperty("esfrontera")
            private boolean esfrontera;

            // Getters y Setters

            public int getIdPoblacion() {
                return idPoblacion;
            }

            public void setIdPoblacion(int idPoblacion) {
                this.idPoblacion = idPoblacion;
            }

            public int getPais() {
                return pais;
            }

            public void setPais(int pais) {
                this.pais = pais;
            }

            public boolean isEstaActivo() {
                return estaActivo;
            }

            public void setEstaActivo(boolean estaActivo) {
                this.estaActivo = estaActivo;
            }

            public boolean isEsfrontera() {
                return esfrontera;
            }

            public void setEsfrontera(boolean esfrontera) {
                this.esfrontera = esfrontera;
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class SucursalAdo {
            @JsonProperty("id")
            private int id;
            @JsonProperty("descripcion")
            private String descripcion;
            @JsonProperty("numeroSucursal")
            private String numeroSucursal;
            @JsonProperty("estaActivo")
            private boolean estaActivo;
            @JsonProperty("region")
            private Region region;
            @JsonProperty("direccion")
            private String direccion;
            @JsonProperty("tituloticket")
            private TituloTicket tituloticket;
            @JsonProperty("publicidad")
            private boolean publicidad;

            // Getters y Setters

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getDescripcion() {
                return descripcion;
            }

            public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
            }

            public String getNumeroSucursal() {
                return numeroSucursal;
            }

            public void setNumeroSucursal(String numeroSucursal) {
                this.numeroSucursal = numeroSucursal;
            }

            public boolean isEstaActivo() {
                return estaActivo;
            }

            public void setEstaActivo(boolean estaActivo) {
                this.estaActivo = estaActivo;
            }

            public Region getRegion() {
                return region;
            }

            public void setRegion(Region region) {
                this.region = region;
            }

            public String getDireccion() {
                return direccion;
            }

            public void setDireccion(String direccion) {
                this.direccion = direccion;
            }

            public TituloTicket getTituloticket() {
                return tituloticket;
            }

            public void setTituloticket(TituloTicket tituloticket) {
                this.tituloticket = tituloticket;
            }

            public boolean isPublicidad() {
                return publicidad;
            }

            public void setPublicidad(boolean publicidad) {
                this.publicidad = publicidad;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Region {
                @JsonProperty("id")
                private int id;
                @JsonProperty("descripcion")
                private String descripcion;
                @JsonProperty("numeroRegion")
                private String numeroRegion;
                @JsonProperty("estaActivo")
                private boolean estaActivo;
                @JsonProperty("empresa")
                private Empresa empresa;

                // Getters y Setters

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getDescripcion() {
                    return descripcion;
                }

                public void setDescripcion(String descripcion) {
                    this.descripcion = descripcion;
                }

                public String getNumeroRegion() {
                    return numeroRegion;
                }

                public void setNumeroRegion(String numeroRegion) {
                    this.numeroRegion = numeroRegion;
                }

                public boolean isEstaActivo() {
                    return estaActivo;
                }

                public void setEstaActivo(boolean estaActivo) {
                    this.estaActivo = estaActivo;
                }

                public Empresa getEmpresa() {
                    return empresa;
                }

                public void setEmpresa(Empresa empresa) {
                    this.empresa = empresa;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class Empresa {
                    @JsonProperty("id")
                    private int id;
                    @JsonProperty("descripcion")
                    private String descripcion;
                    @JsonProperty("numeroEmpresa")
                    private String numeroEmpresa;
                    @JsonProperty("estaActivo")
                    private boolean estaActivo;

                    // Getters y Setters

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getDescripcion() {
                        return descripcion;
                    }

                    public void setDescripcion(String descripcion) {
                        this.descripcion = descripcion;
                    }

                    public String getNumeroEmpresa() {
                        return numeroEmpresa;
                    }

                    public void setNumeroEmpresa(String numeroEmpresa) {
                        this.numeroEmpresa = numeroEmpresa;
                    }

                    public boolean isEstaActivo() {
                        return estaActivo;
                    }

                    public void setEstaActivo(boolean estaActivo) {
                        this.estaActivo = estaActivo;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class TituloTicket {
                @JsonProperty("id")
                private int id;
                @JsonProperty("descripcion")
                private String descripcion;
                @JsonProperty("sucursalAdo")
                private SucursalAdo sucursalAdo;

                // Getters y Setters

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getDescripcion() {
                    return descripcion;
                }

                public void setDescripcion(String descripcion) {
                    this.descripcion = descripcion;
                }

                public SucursalAdo getSucursalAdo() {
                    return sucursalAdo;
                }

                public void setSucursalAdo(SucursalAdo sucursalAdo) {
                    this.sucursalAdo = sucursalAdo;
                }
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ClvArea {
        @JsonProperty("clvArea")
        private int clvArea;
        @JsonProperty("descripcion")
        private String descripcion;
        @JsonProperty("estaActivo")
        private boolean estaActivo;

        // Getters y Setters

        public int getClvArea() {
            return clvArea;
        }

        public void setClvArea(int clvArea) {
            this.clvArea = clvArea;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public boolean isEstaActivo() {
            return estaActivo;
        }

        public void setEstaActivo(boolean estaActivo) {
            this.estaActivo = estaActivo;
        }
    }
}
