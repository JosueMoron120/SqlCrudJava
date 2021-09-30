package com.example.crudsqlite;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"},
        d2 = {"Lcom/example/crudsqlite/CategoriaModel;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "CrudSqlite.app"}
)
public final class CategoriaModel1 {
    private int id;
    @NotNull
    private String name;
    @NotNull
    public static final CategoriaModel.Companion Companion = new CategoriaModel.Companion((DefaultConstructorMarker)null);

    @NotNull
    public String toString() {
        return this.name;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int var1) {
        this.id = var1;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.name = var1;
    }

    public CategoriaModel(int id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        super();
        this.id = id;
        this.name = name;
    }

    // $FF: synthetic method
    public CategoriaModel(int var1, String var2, int var3, DefaultConstructorMarker var4) {
        if ((var3 & 1) != 0) {
            var1 = Companion.getAutoId();
        }

        if ((var3 & 2) != 0) {
            var2 = "";
        }

        this(var1, var2);
    }

    public CategoriaModel() {
        this(0, (String)null, 3, (DefaultConstructorMarker)null);
    }

    public final int component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final CategoriaModel copy(int id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CategoriaModel(id, name);
    }

    // $FF: synthetic method
    public static CategoriaModel copy$default(CategoriaModel var0, int var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.name;
        }

        return var0.copy(var1, var2);
    }

    public int hashCode() {
        int var10000 = Integer.hashCode(this.id) * 31;
        String var10001 = this.name;
        return var10000 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof CategoriaModel) {
                CategoriaModel var2 = (CategoriaModel)var1;
                if (this.id == var2.id && Intrinsics.areEqual(this.name, var2.name)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }

    @Metadata(
            mv = {1, 5, 1},
            k = 1,
            d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"},
            d2 = {"Lcom/example/crudsqlite/CategoriaModel$Companion;", "", "()V", "getAutoId", "", "CrudSqlite.app"}
    )
    public static final class Companion {
        public final int getAutoId() {
            Random random = new Random();
            return random.nextInt(100);
        }

        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}