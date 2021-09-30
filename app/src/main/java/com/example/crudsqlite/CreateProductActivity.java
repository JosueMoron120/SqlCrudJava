package com.example.crudsqlite;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\u0012\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J.\u0010&\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001a¨\u0006+"},
        d2 = {"Lcom/example/crudsqlite/CreateProductActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addButton", "Landroid/widget/Button;", "getAddButton", "()Landroid/widget/Button;", "setAddButton", "(Landroid/widget/Button;)V", "categoryDropdown", "Landroid/widget/AutoCompleteTextView;", "getCategoryDropdown", "()Landroid/widget/AutoCompleteTextView;", "setCategoryDropdown", "(Landroid/widget/AutoCompleteTextView;)V", "idcategoria", "", "idproducto", "listButton", "getListButton", "setListButton", "nameText", "Lcom/google/android/material/textfield/TextInputEditText;", "getNameText", "()Lcom/google/android/material/textfield/TextInputEditText;", "setNameText", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "priceText", "getPriceText", "setPriceText", "stockText", "getStockText", "setStockText", "cleanForm", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "validateForm", "name", "", "price", "stock", "CrudSqlite.app"}
)
public final class CreateProductActivity extends AppCompatActivity {
    public TextInputEditText nameText;
    public TextInputEditText priceText;
    public TextInputEditText stockText;
    public Button addButton;
    public Button listButton;
    public AutoCompleteTextView categoryDropdown;
    private int idcategoria = -1;
    private int idproducto = -1;

    @NotNull
    public final TextInputEditText getNameText() {
        TextInputEditText var10000 = this.nameText;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameText");
        }

        return var10000;
    }

    public final void setNameText(@NotNull TextInputEditText var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.nameText = var1;
    }

    @NotNull
    public final TextInputEditText getPriceText() {
        TextInputEditText var10000 = this.priceText;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("priceText");
        }

        return var10000;
    }

    public final void setPriceText(@NotNull TextInputEditText var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.priceText = var1;
    }

    @NotNull
    public final TextInputEditText getStockText() {
        TextInputEditText var10000 = this.stockText;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stockText");
        }

        return var10000;
    }

    public final void setStockText(@NotNull TextInputEditText var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.stockText = var1;
    }

    @NotNull
    public final Button getAddButton() {
        Button var10000 = this.addButton;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addButton");
        }

        return var10000;
    }

    public final void setAddButton(@NotNull Button var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.addButton = var1;
    }

    @NotNull
    public final Button getListButton() {
        Button var10000 = this.listButton;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listButton");
        }

        return var10000;
    }

    public final void setListButton(@NotNull Button var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.listButton = var1;
    }

    @NotNull
    public final AutoCompleteTextView getCategoryDropdown() {
        AutoCompleteTextView var10000 = this.categoryDropdown;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryDropdown");
        }

        return var10000;
    }

    public final void setCategoryDropdown(@NotNull AutoCompleteTextView var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.categoryDropdown = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300110);
        View var10001 = this.findViewById(1000334);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.tiet_create_product_name)");
        this.nameText = (TextInputEditText)var10001;
        var10001 = this.findViewById(1000164);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.tiet_create_product_price)");
        this.priceText = (TextInputEditText)var10001;
        var10001 = this.findViewById(1000353);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.tiet_create_product_stock)");
        this.stockText = (TextInputEditText)var10001;
        var10001 = this.findViewById(1000057);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.btn_create_product_add)");
        this.addButton = (Button)var10001;
        var10001 = this.findViewById(1000363);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.btn_create_product_list)");
        this.listButton = (Button)var10001;
        var10001 = this.findViewById(1000033);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.actv_create_product_category)");
        this.categoryDropdown = (AutoCompleteTextView)var10001;
        SQLiteHelper sqLiteHelper = new SQLiteHelper(this.getApplicationContext());
        ArrayList items = sqLiteHelper.getAllCategorias();
        ArrayAdapter adapter = new ArrayAdapter(this.getApplicationContext(), 1300078, (List)items);
        AutoCompleteTextView var10000 = this.categoryDropdown;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryDropdown");
        }

        var10000.setAdapter((ListAdapter)adapter);
        Intent var10 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(var10, "intent");
        Bundle var11 = var10.getExtras();
        Button var13;
        if (var11 != null) {
            Bundle var5 = var11;
            boolean var6 = false;
            boolean var7 = false;
            int var9 = false;
            TextInputEditText var12 = this.nameText;
            if (var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nameText");
            }

            var12.setText((CharSequence)var5.getString("nomprod"));
            var12 = this.priceText;
            if (var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("priceText");
            }

            var12.setText((CharSequence)String.valueOf(var5.getDouble("precio")));
            var12 = this.stockText;
            if (var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stockText");
            }

            var12.setText((CharSequence)String.valueOf(var5.getInt("stock")));
            if (var5.getInt("idproducto") != -1) {
                this.idproducto = var5.getInt("idproducto");
                var13 = this.addButton;
                if (var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addButton");
                }

                var13.setText((CharSequence)"Editar Producto");
            }
        }

        var13 = this.addButton;
        if (var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addButton");
        }

        var13.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                CreateProductActivity.this.validateForm(CreateProductActivity.this.idproducto, String.valueOf(CreateProductActivity.this.getNameText().getText()), String.valueOf(CreateProductActivity.this.getPriceText().getText()), String.valueOf(CreateProductActivity.this.getStockText().getText()), CreateProductActivity.this.idcategoria);
            }
        }));
        var13 = this.listButton;
        if (var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listButton");
        }

        var13.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                CreateProductActivity.this.startActivity(new Intent(CreateProductActivity.this.getApplicationContext(), ListProductActivity.class));
            }
        }));
        var10000 = this.categoryDropdown;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryDropdown");
        }

        var10000.setOnItemClickListener((OnItemClickListener)(new OnItemClickListener() {
            public final void onItemClick(AdapterView parent, View view, int position, long id) {
                Object var10000 = CreateProductActivity.this.getCategoryDropdown().getAdapter().getItem(position);
                if (var10000 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.example.crudsqlite.CategoriaModel");
                } else {
                    CategoriaModel item = (CategoriaModel)var10000;
                    CreateProductActivity.this.idcategoria = item.getId();
                }
            }
        }));
    }

    public final void cleanForm() {
        TextInputEditText var10000 = this.nameText;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nameText");
        }

        var10000.setText((CharSequence)"");
        var10000 = this.priceText;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("priceText");
        }

        var10000.setText((CharSequence)"");
        var10000 = this.stockText;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stockText");
        }

        var10000.setText((CharSequence)"");
    }

    public final void validateForm(int idproducto, @NotNull String name, @NotNull String price, @NotNull String stock, int idcategoria) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stock, "stock");
        if (StringsKt.isBlank((CharSequence)name) && StringsKt.isBlank((CharSequence)price) && StringsKt.isBlank((CharSequence)stock) && idcategoria == -1) {
            AutoCompleteTextView var10001 = this.categoryDropdown;
            if (var10001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoryDropdown");
            }

            Log.i("ContentValues", String.valueOf(var10001.getEditableText()));
            Toast.makeText(this.getApplicationContext(), (CharSequence)"Empty fields", 0).show();
        } else {
            SQLiteHelper sqLiteHelper = new SQLiteHelper(this.getApplicationContext());
            double var10005;
            if (idproducto == -1) {
                boolean var10 = false;
                var10005 = Double.parseDouble(price);
                var10 = false;
                long successCode = sqLiteHelper.insertProducto(new ProductModel(idproducto, name, var10005, Integer.parseInt(stock), idcategoria));
                Log.i("ContentValues", String.valueOf(successCode));
                if (successCode != (long)-1) {
                    Toast.makeText(this.getApplicationContext(), (CharSequence)"Sucessfully Inserted Row", 0).show();
                } else {
                    Toast.makeText(this.getApplicationContext(), (CharSequence)"que asiendi", 0).show();
                }
            } else {
                boolean var9 = false;
                var10005 = Double.parseDouble(price);
                var9 = false;
                int successCode = sqLiteHelper.updateProducto(new ProductModel(idproducto, name, var10005, Integer.parseInt(stock), idcategoria));
                Log.i("ContentValues", String.valueOf(successCode));
                if (successCode != -1) {
                    Toast.makeText(this.getApplicationContext(), (CharSequence)("Sucessfully Updated Row " + successCode), 0).show();
                    this.startActivity(new Intent(this.getApplicationContext(), ListProductActivity.class));
                } else {
                    Toast.makeText(this.getApplicationContext(), (CharSequence)"que asiendi", 0).show();
                }
            }

        }
    }

    // $FF: synthetic method
    public static final void access$setIdproducto$p(CreateProductActivity $this, int var1) {
        $this.idproducto = var1;
    }
}
