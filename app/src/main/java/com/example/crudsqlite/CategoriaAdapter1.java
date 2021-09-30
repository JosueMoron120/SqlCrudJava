package com.example.crudsqlite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\f\u001a\u00020\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u001a\u0010\u0017\u001a\u00020\n2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tJ\u001a\u0010\u0019\u001a\u00020\n2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"},
        d2 = {"Lcom/example/crudsqlite/CategoriaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/crudsqlite/CategoriaAdapter$CategoriaViewHolder;", "()V", "catList", "Ljava/util/ArrayList;", "Lcom/example/crudsqlite/CategoriaModel;", "Lkotlin/collections/ArrayList;", "onClickDeleteItem", "Lkotlin/Function1;", "", "onClickItem", "addItems", "items", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickItem", "callback", "setOnclickDeleteItem", "CategoriaViewHolder", "app_debug"}
)
public final class CategoriaAdapter1 extends Adapter {
    private ArrayList catList = new ArrayList();
    private Function1 onClickItem;
    private Function1 onClickDeleteItem;

    public final void addItems(@NotNull ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.catList = items;
        this.notifyDataSetChanged();
    }

    public final void setOnClickItem(@NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onClickItem = callback;
    }

    public final void setOnclickDeleteItem(@NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onClickDeleteItem = callback;
    }

    @NotNull
    public CategoriaAdapter.CategoriaViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View var10002 = LayoutInflater.from(parent.getContext()).inflate(1300082, parent, false);
        Intrinsics.checkNotNullExpressionValue(var10002, "LayoutInflater.from(pare…gory_item, parent, false)");
        return new CategoriaAdapter.CategoriaViewHolder(var10002);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull CategoriaAdapter.CategoriaViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object var10000 = this.catList.get(position);
        Intrinsics.checkNotNullExpressionValue(var10000, "catList[position]");
        final CategoriaModel cat = (CategoriaModel)var10000;
        holder.bindView(cat);
        holder.itemView.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Function1 var10000 = CategoriaAdapter.this.onClickItem;
                if (var10000 != null) {
                    Unit var2 = (Unit)var10000.invoke(cat);
                }

            }
        }));
        holder.getBtnDelete().setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Function1 var10000 = CategoriaAdapter.this.onClickDeleteItem;
                if (var10000 != null) {
                    Unit var2 = (Unit)var10000.invoke(cat);
                }

            }
        }));
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(ViewHolder var1, int var2) {
        this.onBindViewHolder((CategoriaAdapter.CategoriaViewHolder)var1, var2);
    }

    public int getItemCount() {
        return this.catList.size();
    }

    // $FF: synthetic method
    public static final void access$setOnClickItem$p(CategoriaAdapter $this, Function1 var1) {
        $this.onClickItem = var1;
    }

    // $FF: synthetic method
    public static final void access$setOnClickDeleteItem$p(CategoriaAdapter $this, Function1 var1) {
        $this.onClickDeleteItem = var1;
    }

    @Metadata(
            mv = {1, 5, 1},
            k = 1,
            d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004¨\u0006\u0015"},
            d2 = {"Lcom/example/crudsqlite/CategoriaAdapter$CategoriaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "btnDelete", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "getBtnDelete", "()Landroid/widget/Button;", "setBtnDelete", "(Landroid/widget/Button;)V", "name", "Landroid/widget/TextView;", "getView", "()Landroid/view/View;", "setView", "bindView", "", "cat", "Lcom/example/crudsqlite/CategoriaModel;", "app_debug"}
    )
    public static final class CategoriaViewHolder extends ViewHolder {
        private TextView name;
        private Button btnDelete;
        @NotNull
        private View view;

        public final Button getBtnDelete() {
            return this.btnDelete;
        }

        public final void setBtnDelete(Button var1) {
            this.btnDelete = var1;
        }

        public final void bindView(@NotNull CategoriaModel cat) {
            Intrinsics.checkNotNullParameter(cat, "cat");
            TextView var10000 = this.name;
            Intrinsics.checkNotNullExpressionValue(var10000, "name");
            var10000.setText((CharSequence)cat.getName());
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setView(@NotNull View var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            this.view = var1;
        }

        public CategoriaViewHolder(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            super(view);
            this.view = view;
            this.name = (TextView)this.view.findViewById(1000289);
            this.btnDelete = (Button)this.view.findViewById(1000413);
        }
    }
}


