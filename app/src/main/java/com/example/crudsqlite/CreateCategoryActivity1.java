package com.example.crudsqlite;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"},
        d2 = {"Lcom/example/crudsqlite/CreateCategoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/crudsqlite/CategoriaAdapter;", "btnAdd", "Landroid/widget/Button;", "btnUpdate", "btnView", "cat", "Lcom/example/crudsqlite/CategoriaModel;", "edName", "Landroid/widget/EditText;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "sqliteHelper", "Lcom/example/crudsqlite/SQLiteHelper;", "addCategoria", "", "clearEditText", "deleteCategoria", "id", "", "getCategoria", "initRecyclerView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateCategoria", "CrudSqlite.app"}
)
public final class CreateCategoryActivity1 extends AppCompatActivity {
    private Button btnAdd;
    private Button btnView;
    private Button btnUpdate;
    private EditText edName;
    private SQLiteHelper sqliteHelper;
    private RecyclerView recyclerView;
    private CategoriaAdapter adapter;
    private CategoriaModel cat;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300008);
        this.initRecyclerView();
        this.sqliteHelper = new SQLiteHelper((Context)this);
        View var10001 = this.findViewById(1000109);
        Intrinsics.checkNotNull(var10001);
        this.btnUpdate = (Button)var10001;
        var10001 = this.findViewById(1000323);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.til_create_category_name)");
        this.edName = (EditText)var10001;
        var10001 = this.findViewById(1000342);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.btn_button)");
        this.btnAdd = (Button)var10001;
        var10001 = this.findViewById(1000311);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.btn_button_view)");
        this.btnView = (Button)var10001;
        Button var10000 = this.btnAdd;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnAdd");
        }

        var10000.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                CreateCategoryActivity.this.addCategoria();
            }
        }));
        var10000 = this.btnView;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnView");
        }

        var10000.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                CreateCategoryActivity.this.getCategoria();
            }
        }));
        var10000 = this.btnUpdate;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnUpdate");
        }

        var10000.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                CreateCategoryActivity.this.updateCategoria();
            }
        }));
        CategoriaAdapter var2 = this.adapter;
        if (var2 != null) {
            var2.setOnClickItem((Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke((CategoriaModel)var1);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull CategoriaModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Toast.makeText((Context)CreateCategoryActivity.this, (CharSequence)it.getName(), 0).show();
                    CreateCategoryActivity.access$getEdName$p(CreateCategoryActivity.this).setText((CharSequence)it.getName());
                    CreateCategoryActivity.this.cat = it;
                }
            }));
        }

        var2 = this.adapter;
        if (var2 != null) {
            var2.setOnclickDeleteItem((Function1)(new Function1() {
                // $FF: synthetic method
                // $FF: bridge method
                public Object invoke(Object var1) {
                    this.invoke((CategoriaModel)var1);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull CategoriaModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CreateCategoryActivity.this.deleteCategoria(it.getId());
                }
            }));
        }

    }

    private final void getCategoria() {
        SQLiteHelper var10000 = this.sqliteHelper;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sqliteHelper");
        }

        ArrayList catList = var10000.getAllCategorias();
        Log.e("ppp", String.valueOf(catList.size()));
        CategoriaAdapter var2 = this.adapter;
        if (var2 != null) {
            var2.addItems(catList);
        }

    }

    private final void updateCategoria() {
        EditText var10000 = this.edName;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edName");
        }

        String name = var10000.getText().toString();
        CategoriaModel var10001 = this.cat;
        if (name == (var10001 != null ? var10001.getName() : null)) {
            Toast.makeText((Context)this, (CharSequence)"Registro no actualizado", 1).show();
        } else if (this.cat != null) {
            CategoriaModel var10002 = this.cat;
            Intrinsics.checkNotNull(var10002);
            CategoriaModel cat = new CategoriaModel(var10002.getId(), name);
            SQLiteHelper var4 = this.sqliteHelper;
            if (var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sqliteHelper");
            }

            int status = var4.updateCategoria(cat);
            if (status > -1) {
                this.clearEditText();
                this.getCategoria();
            } else {
                Toast.makeText((Context)this, (CharSequence)"Actualizado Correctamente", 1).show();
            }

        }
    }

    private final void addCategoria() {
        EditText var10000 = this.edName;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edName");
        }

        String name = var10000.getText().toString();
        if (StringsKt.isBlank((CharSequence)name)) {
            Toast.makeText((Context)this, (CharSequence)"Coloque datos por favor", 1).show();
        } else {
            CategoriaModel cat = new CategoriaModel(0, name, 1, (DefaultConstructorMarker)null);
            SQLiteHelper var5 = this.sqliteHelper;
            if (var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sqliteHelper");
            }

            long status = var5.insertCategoria(cat);
            if (status > (long)-1) {
                Toast.makeText((Context)this, (CharSequence)"Categoria añadida", 0).show();
                this.clearEditText();
            } else {
                Toast.makeText((Context)this, (CharSequence)"Ocurrió un error", 0).show();
            }
        }

    }

    private final void deleteCategoria(final int id) {
        Builder builder = new Builder((Context)this);
        builder.setMessage((CharSequence)"Estás seguro de elimianr este elemento?");
        builder.setCancelable(true);
        builder.setPositiveButton((CharSequence)"si", (android.content.DialogInterface.OnClickListener)(new android.content.DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialog, int $noName_1) {
                CreateCategoryActivity.access$getSqliteHelper$p(CreateCategoryActivity.this).deleteCategoria(id);
                CreateCategoryActivity.this.getCategoria();
                dialog.dismiss();
            }
        }));
        builder.setNegativeButton((CharSequence)"no", (android.content.DialogInterface.OnClickListener)null.INSTANCE);
        AlertDialog var10000 = builder.create();
        Intrinsics.checkNotNullExpressionValue(var10000, "builder.create()");
        AlertDialog alert = var10000;
        alert.show();
    }

    private final void initRecyclerView() {
        View var10001 = this.findViewById(1000376);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.recyclerView)");
        this.recyclerView = (RecyclerView)var10001;
        RecyclerView var10000 = this.recyclerView;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }

        var10000.setLayoutManager((LayoutManager)(new LinearLayoutManager((Context)this)));
        var10000 = this.recyclerView;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }

        var10000.setAdapter((Adapter)this.adapter);
    }

    private final void clearEditText() {
        EditText var10000 = this.edName;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edName");
        }

        var10000.setText((CharSequence)"");
    }

    // $FF: synthetic method
    public static final EditText access$getEdName$p(CreateCategoryActivity $this) {
        EditText var10000 = $this.edName;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edName");
        }

        return var10000;
    }

    // $FF: synthetic method
    public static final void access$setEdName$p(CreateCategoryActivity $this, EditText var1) {
        $this.edName = var1;
    }

    // $FF: synthetic method
    public static final CategoriaModel access$getCat$p(CreateCategoryActivity $this) {
        return $this.cat;
    }

    // $FF: synthetic method
    public static final SQLiteHelper access$getSqliteHelper$p(CreateCategoryActivity $this) {
        SQLiteHelper var10000 = $this.sqliteHelper;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sqliteHelper");
        }

        return var10000;
    }

    // $FF: synthetic method
    public static final void access$setSqliteHelper$p(CreateCategoryActivity $this, SQLiteHelper var1) {
        $this.sqliteHelper = var1;
    }
}