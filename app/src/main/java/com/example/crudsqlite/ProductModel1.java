package com.example.crudsqlite;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nB7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006\u001f"},
        d2 = {"Lcom/example/crudsqlite/ProductModel;", "", "idproducto", "", "nomprod", "", "precio", "", "stock", "idcategoria", "(ILjava/lang/String;DII)V", "nomcat", "(ILjava/lang/String;DIILjava/lang/String;)V", "getIdcategoria", "()I", "setIdcategoria", "(I)V", "getIdproducto", "setIdproducto", "getNomcat", "()Ljava/lang/String;", "setNomcat", "(Ljava/lang/String;)V", "getNomprod", "setNomprod", "getPrecio", "()D", "setPrecio", "(D)V", "getStock", "setStock", "CrudSqlite.app"}
)
public final class ProductModel1 {
    private int idproducto;
    @NotNull
    private String nomprod;
    private double precio;
    private int stock;
    private int idcategoria;
    public String nomcat;

    public final int getIdproducto() {
        return this.idproducto;
    }

    public final void setIdproducto(int var1) {
        this.idproducto = var1;
    }

    @NotNull
    public final String getNomprod() {
        return this.nomprod;
    }

    public final void setNomprod(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.nomprod = var1;
    }

    public final double getPrecio() {
        return this.precio;
    }

    public final void setPrecio(double var1) {
        this.precio = var1;
    }

    public final int getStock() {
        return this.stock;
    }

    public final void setStock(int var1) {
        this.stock = var1;
    }

    public final int getIdcategoria() {
        return this.idcategoria;
    }

    public final void setIdcategoria(int var1) {
        this.idcategoria = var1;
    }

    @NotNull
    public final String getNomcat() {
        String var10000 = this.nomcat;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nomcat");
        }

        return var10000;
    }

    public final void setNomcat(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.nomcat = var1;
    }

    public ProductModel(int idproducto, @NotNull String nomprod, double precio, int stock, int idcategoria) {
        Intrinsics.checkNotNullParameter(nomprod, "nomprod");
        super();
        this.idproducto = idproducto;
        this.nomprod = nomprod;
        this.precio = precio;
        this.stock = stock;
        this.idcategoria = idcategoria;
    }

    public ProductModel(int idproducto, @NotNull String nomprod, double precio, int stock, int idcategoria, @NotNull String nomcat) {
        Intrinsics.checkNotNullParameter(nomprod, "nomprod");
        Intrinsics.checkNotNullParameter(nomcat, "nomcat");
        super();
        this.idproducto = idproducto;
        this.nomprod = nomprod;
        this.precio = precio;
        this.stock = stock;
        this.idcategoria = idcategoria;
        this.nomcat = nomcat;
    }
}
